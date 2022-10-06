package com.dw.basic.demo.basicdemo.activities;

import com.dw.basic.demo.basicdemo.users.User;
import javax.persistence.*;
import java.util.List;

@Entity
public class Activity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    private String name;

    private String date;

    private String eDay;

    private String cDay;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
}

    public void setName(String name) {
        this.name = name;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String geteDay() {
        return eDay;
    }

    public void seteDay(String eDay) {
        this.eDay = eDay;
    }

    public String getcDay() {
        return cDay;
    }

    public void setcDay(String cDay) {
        this.cDay = cDay;
    }

    public Activity()
    {

    }

    public List<User> getBookings() {
        return bookings;
    }


    public void addBookings(User booking) {
        this.bookings.add(booking);
    }


    /*
    一个activity可能有多个users参加
     */
    @ManyToMany
    private List<User> bookings;

}
