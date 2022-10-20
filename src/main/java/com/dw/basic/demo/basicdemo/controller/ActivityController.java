package com.dw.basic.demo.basicdemo.controller;

import com.dw.basic.demo.basicdemo.POJO.*;
import com.dw.basic.demo.basicdemo.POJO.activities.*;
import com.dw.basic.demo.basicdemo.repo.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.*;
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

    /*
    Based on Chinese Day return search results
     */
    @GetMapping(value="/findByCDay/{cDay}", produces="application/json;charset=UTF-8")
    public List<Activity> findBycDay(@PathVariable(value = "cDay") String cDay) throws UnsupportedEncodingException {
        return activityRepo.findBycDay(cDay);
    }

    /*
    Based on English Day return search results
     */
    @GetMapping(value="/findByEDay/{eDay}")
    public List<Activity> findByeDay(@PathVariable(value = "eDay") String eDay){
        return activityRepo.findByeDay(eDay);
    }

    /*
    Delete all activities
     */
    @DeleteMapping (value="/deleteAll")
    public void deleteAllActivities(){
        activityRepo.deleteAll();
    }

    /*
    Delete an specific activity
     */
    @DeleteMapping (value="/delete/{id}")
    public void deleteActivityById(@PathVariable(value = "id") Integer id){
        activityRepo.deleteById(id);
    }


    /*
    save a new activity
     */
    @PostMapping(value="/save")
    public String saveOne(@RequestParam("type") int type, @RequestParam("date") String date){
        Activity activity = activityFactory.create(type, date);
        activityRepo.save(activity);
        return activity.info();

    }

    /*
    Based on activity id + user contactNumber, book activity
     */
    @Modifying
    @PostMapping(value="/saveBooking")
    public String saveBooking(@RequestParam("activityId") Integer activityId, @RequestParam("contactNumber") String contactNumber){
        Activity activity = activityRepo.findById(activityId).orElse(null);
        User user = userRepo.findByContactNumber(contactNumber);

        boolean couldSignUp = activity.whetherCouldSignUp(contactNumber);

        if(couldSignUp)
        {
            activity.addBookings(user);
            activityRepo.save(activity);
        }


        return activity.doActivity(couldSignUp);

    }

    /*
    search by pages
     */
    @GetMapping("/page")
    public List <Activity> findPage(@RequestParam Integer pageNum,@RequestParam Integer pageSize){
        // 0-index
        pageNum -= 1;
        Pageable pageable = PageRequest.of(pageNum, pageSize);
        Page<Activity> page = activityRepo.findAll(pageable);

        return page.getContent();
    }

}