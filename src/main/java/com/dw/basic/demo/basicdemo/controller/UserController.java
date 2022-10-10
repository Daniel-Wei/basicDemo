package com.dw.basic.demo.basicdemo.controller;

import com.dw.basic.demo.basicdemo.POJO.User;
import com.dw.basic.demo.basicdemo.repo.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/users")
public class UserController {

    @Autowired
    private UserRepo userRepo;

    /*
    新存储一个user
     */
    @PostMapping(value="/save")
    public User saveOne(@RequestParam("name") String name, @RequestParam("contactNumber") String contactNumber){
        User user = new User();

        // 电话号码具有唯一性 所以设置成user的id
        user.setId(contactNumber);
        user.setName(name);
        user.setContactNumber(contactNumber);

        return userRepo.save(user);
    }

    /*
    删除所有user
     */
    @DeleteMapping(value="/deleteAll")
    public void deleteAllActivities(){
        userRepo.deleteAll();
    }
}
