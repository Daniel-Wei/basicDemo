package com.dw.basic.demo.basicdemo.activities;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.io.UnsupportedEncodingException;
import java.util.List;

@RestController
@RequestMapping("/activities")
public class ActivityController {

    @Autowired
    private ActivityRepo activityRepo;
    @RequestMapping(value = "/all")
    public List<Activity> getAllActivitiesInfo(){
        return activityRepo.findAll();
    }

    @GetMapping(value="/findByCDay/{cDay}", produces="application/json;charset=UTF-8")
    public List<Activity> findBycDay(@PathVariable(value = "cDay") String cDay) throws UnsupportedEncodingException {
//        String path  = new String(cDay.getBytes("ISO-8859-1"), "utf8");
//        System.out.println(path);
        return activityRepo.findBycDay(cDay);
    }

    @GetMapping(value="/findByEDay/{eDay}")
    public List<Activity> findByeDay(@PathVariable(value = "eDay") String eDay){
        return activityRepo.findByeDay(eDay);
    }

    @PostMapping(value="/save")
    public Activity saveOne(@RequestParam("cDay") String cDay, @RequestParam("eDay") String eDay,@RequestParam("date") String date, @RequestParam("name") String name){
        Activity activity = new Activity();
        activity.setcDay(cDay);
        activity.seteDay(eDay);
        activity.setDate(date);
        activity.setName(name);

        return activityRepo.save(activity);
    }




}