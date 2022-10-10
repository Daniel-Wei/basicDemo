package com.dw.basic.demo.basicdemo.POJO;

import com.dw.basic.demo.basicdemo.POJO.activities.Activity;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
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
    protected List<Activity> activities;


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
