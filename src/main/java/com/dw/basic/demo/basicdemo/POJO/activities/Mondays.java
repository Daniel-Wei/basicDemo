package com.dw.basic.demo.basicdemo.POJO.activities;

import com.dw.basic.demo.basicdemo.POJO.User;
import com.dw.basic.demo.basicdemo.constants.ActivityConstants;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue(ActivityConstants.E_MON)
public class Mondays extends Activity {
    public Mondays(String date){
        super(date);
        this.category = ActivityConstants.FISHING;
        this.cDay = ActivityConstants.C_MON;
        this.eDay = ActivityConstants.E_MON;
        this.capacity = ActivityConstants.MON_BOOKINGS_SIZE;
    }
    public Mondays(){
        super();
    }

    @Override
    public void printInfo() {
        System.out.println("~ ~ 🎣 ~ ~ MONDAY FISHING ~ ~ 🎣 ~ ~ ");
        super.printInfo();

    }

//    @Override
//    void signUp() {
//
//    }
//
//    @Override
//    void during() {
//        this.printInfo();
//
//    }
//
//    @Override
//    void settle() {
//
//    }
}
