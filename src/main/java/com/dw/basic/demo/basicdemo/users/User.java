package com.dw.basic.demo.basicdemo.users;


import com.dw.basic.demo.basicdemo.activities.Activity;

import javax.persistence.*;
import java.util.List;

@Entity
public class User {

    private String name;
    private String contactNumber;

    public Integer getId() {
        return id;
    }

    public void setId(String contactNumber) {
        this.id = Integer.valueOf(contactNumber);
    }

    @Id
    private Integer id;

    /*
    一个user可能会参加多个activities
     */
    @ManyToMany(mappedBy = "bookings")
    private List<Activity> activities;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getContactNumber() {
        return contactNumber;
    }

    public void setContactNumber(String contactNumber) {
        this.contactNumber = contactNumber;
    }

    public User()
    {

    }

}
