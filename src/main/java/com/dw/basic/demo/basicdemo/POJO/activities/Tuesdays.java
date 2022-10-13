package com.dw.basic.demo.basicdemo.POJO.activities;

import com.dw.basic.demo.basicdemo.constants.ActivityConstants;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue(ActivityConstants.E_TUES)
public class Tuesdays extends Activity{
    public Tuesdays(String date) {
        super(date);
        this.category = ActivityConstants.HIKING;
        this.cDay = ActivityConstants.C_TUES;
        this.eDay = ActivityConstants.E_TUES;
        this.capacity = ActivityConstants.TUES_BOOKINGS_SIZE;
    }
    public Tuesdays(){
        super();
    }

    @Override
    public void printInfo() {
        System.out.println("~ ~ 🧗‍‍ ~ ~ TUESDAY HIKING ~ ~ 🧗‍ ~ ~ ");
        super.printInfo();

    }
}
