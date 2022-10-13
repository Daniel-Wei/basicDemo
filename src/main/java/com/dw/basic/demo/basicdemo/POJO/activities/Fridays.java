package com.dw.basic.demo.basicdemo.POJO.activities;

import com.dw.basic.demo.basicdemo.constants.ActivityConstants;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue(ActivityConstants.E_FRI)
public class Fridays extends Activity{
    public Fridays(String date) {
        super(date);
        this.category = ActivityConstants.SWIMMING;
        this.cDay = ActivityConstants.C_FRI;
        this.eDay = ActivityConstants.E_FRI;
        this.capacity = ActivityConstants.FRI_BOOKINGS_SIZE;
    }

    public Fridays(){
        super();
    }

    @Override
    public void printInfo() {
        System.out.println("~ ~ 🏊‍ ~ ~ FRIDAY SWIMMING ~ ~ 🏊‍ ~ ~ ");
        super.printInfo();
    }
}
