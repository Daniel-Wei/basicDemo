package com.dw.basic.demo.basicdemo.POJO.activities;

import com.dw.basic.demo.basicdemo.constants.ActivityConstants;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue(ActivityConstants.E_WEEKEND)
public class Weekends extends Activity{
    public Weekends(String date) {
        super(date);
        this.category = ActivityConstants.SKYDIVING;
        this.cDay = ActivityConstants.C_WEEKEND;
        this.eDay = ActivityConstants.E_WEEKEND;
        this.capacity = ActivityConstants.WEEKENDS_BOOKINGS_SIZE;
        this.price = ActivityConstants.WEEKENDS_BOOKINGS_PRICE;
    }

    public Weekends(){
        super();
    }

    @Override
    public String info() {
        return ActivityConstants.WEEKEND_DISPLAY + super.info();
    }

    @Override
    String signUp() {
        return ActivityConstants.WEEKEND_DISPLAY + ActivityConstants.SKYDIVING_INFO;
    }


    @Override
    String settle(boolean couldSignUp)
    {
        return ActivityConstants.WEEKEND_DISPLAY + super.settle(couldSignUp);

    }
}
