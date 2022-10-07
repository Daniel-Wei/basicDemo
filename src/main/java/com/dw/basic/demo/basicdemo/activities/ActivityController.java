package com.dw.basic.demo.basicdemo.activities;

import com.dw.basic.demo.basicdemo.users.User;
import com.dw.basic.demo.basicdemo.users.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.web.bind.annotation.*;

import java.io.UnsupportedEncodingException;
import java.util.List;

@RestController
@RequestMapping("/activities")
public class ActivityController {

    @Autowired
    private ActivityRepo activityRepo;

    private ActivityFactory activityFactory = new ActivityFactory();

    @Autowired
    private UserRepo userRepo;


    @RequestMapping(value = "/all")
    public String getAllActivitiesInfo(){
        List<Activity> all =  activityRepo.findAll();
        String res = "";
        for (Activity activity: all) {
           List<User> users = activity.getBookings();
           for(User user: users)
           {
               res += user.getName() + user.getContactNumber();
           }

        }

        return res;
    }

    @GetMapping(value="/findByCDay/{cDay}", produces="application/json;charset=UTF-8")
    public List<Activity> findBycDay(@PathVariable(value = "cDay") String cDay) throws UnsupportedEncodingException {
        return activityRepo.findBycDay(cDay);
    }

    @GetMapping(value="/findByEDay/{eDay}")
    public void findByeDay(@PathVariable(value = "eDay") String eDay){
        List<Activity> all =  activityRepo.findByeDay(eDay);

        for (Activity activity: all) {
            System.out.println(activity);

        }


    }

    @DeleteMapping (value="/deleteAll")
    public void deleteAllActivities(){
        activityRepo.deleteAll();
    }

    @DeleteMapping (value="/delete/{id}")
    public void deleteActivityById(@PathVariable(value = "id") Integer id){
        activityRepo.deleteById(id);
    }

    @PostMapping(value="/save")
    public Activity saveOne(@RequestParam("type") int type, @RequestParam("date") String date){
        Activity activity = activityFactory.create(type, date);
        return activityRepo.save(activity);
    }

    @Modifying
    @PostMapping(value="/saveBooking/{id}")
    public String saveBooking(@RequestParam("id") Integer id, @RequestParam("contactNumber") String contactNumber){
        Activity activity = activityRepo.findById(id).orElse(null);

        User user = userRepo.findByContactNumber(contactNumber);
        activity.addBookings(user);
        activityRepo.save(activity);



        return "user: " + user.getId() + " | " + user.getName()  + " | " + user.getContactNumber()
                +"\n booked activity: " + activity.getDate() + " | " + activity.getCategory();
    }




}