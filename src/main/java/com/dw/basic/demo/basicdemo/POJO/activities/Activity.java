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
public abstract class Activity implements ActivityInterface{

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    protected Integer id;

    protected String category;

    protected String date;

    protected String eDay;

    protected String cDay;

    protected Integer capacity;

    protected Integer price;


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

    @Override
    public String info() {

        return "Activity ID:" + this.getId() + "\n"
                + "Activity Category: " + this.category + "\n"
                + "Activity Date: " + this.date + "\n"
                + "Activity Day: " + this.eDay + "\n"
                + "周几: " + this.cDay + "\n"
                + "Activity Capacity: " + this.capacity;

    }

    protected boolean alrSignedUp(String contactNumber)
    {
        for(User user: this.getBookings()){
            if(user.getContactNumber().equals(contactNumber))
            {
                return true;
            }
        }
        return false;
    }

    public boolean whetherCouldSignUp(String contactNumber)
    {
        return (this.getBookings().size() < this.capacity) && !(alrSignedUp(contactNumber));
    }


    abstract String signUp();

    //结算
    String settle(boolean couldSignUp)
    {
        String price = "Price : " + this.price+ "\n";
        String bookingRes;
        if(couldSignUp)
        {
            bookingRes = "Congratulations! You just booked it! ";
        }else
        {

            bookingRes = "Oops! You have already booked it or it is already full.";
        }


        return price + bookingRes;
    }

    //模板
    public final String doActivity(boolean couldSignUp){
        return signUp() + info() + settle(couldSignUp);
    }

}
