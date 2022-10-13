package com.dw.basic.demo.basicdemo.POJO.activities;

import com.dw.basic.demo.basicdemo.constants.ActivityConstants;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue(ActivityConstants.EFriday)
public class Fridays extends Activity{
    public Fridays(String date) {
        super(date);
        this.category = ActivityConstants.SWIMMING;
        this.cDay = ActivityConstants.CFriday;
        this.eDay = ActivityConstants.EFriday;
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
