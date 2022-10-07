package com.dw.basic.demo.basicdemo.users;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/users")
public class UserController {

    @Autowired
    private UserRepo userRepo;

    @PostMapping(value="/save")
    public User saveOne(@RequestParam("name") String name, @RequestParam("contactNumber") String contactNumber){
        User user = new User();

        /*
        电话号码具有唯一性 所以设置成user的id
         */
        user.setId(contactNumber);
        user.setName(name);
        user.setContactNumber(contactNumber);

        return userRepo.save(user);
    }

    @DeleteMapping(value="/deleteAll")
    public void deleteAllActivities(){
        userRepo.deleteAll();
    }
}
