package com.dw.basic.demo.basicdemo.POJO.activities;

import com.dw.basic.demo.basicdemo.POJO.User;
import lombok.Getter;
import lombok.Setter;
import javax.persistence.*;
import java.util.List;

@Entity
@Getter
@Setter
@Inheritance(strategy = InheritanceType.JOINED)
@DiscriminatorColumn(name = "dtype")

public abstract class Activity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    protected Integer id;

    protected String category;

    protected String date;

    protected String eDay;

    protected String cDay;

    /*
    一个activity可能有多个users参加
     */
    @ManyToMany
    protected List<User> bookings;

    public void addBookings(User booking) {
        this.bookings.add(booking);
    }

    public Activity(String date)
    {
        this.date = date;
    }

    public Activity(){}

}
