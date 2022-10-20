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
    save a new user
     */
    @PostMapping(value="/save")
    public User saveOne(@RequestParam("name") String name, @RequestParam("contactNumber") String contactNumber){
        User user = new User();

        // contact number supposed to be unique, so set it as id
        user.setId(contactNumber);
        user.setName(name);
        user.setContactNumber(contactNumber);

        return userRepo.save(user);
    }

    /*
    delete all users
     */
    @DeleteMapping(value="/deleteAll")
    public void deleteAllActivities(){
        userRepo.deleteAll();
    }
}
