package com.dw.basic.demo.basicdemo.POJO.activities;

import com.dw.basic.demo.basicdemo.constants.ActivityConstants;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue(ActivityConstants.E_WED)
public class Wednesdays extends Activity{
    public Wednesdays(String date) {
        super(date);
        this.category = ActivityConstants.SWIMMING;
        this.cDay = ActivityConstants.C_WED;
        this.eDay = ActivityConstants.E_WED;
        this.capacity = ActivityConstants.WED_BOOKINGS_SIZE;
        this.price = ActivityConstants.WED_BOOKINGS_PRICE;
    }
    public Wednesdays(){
        super();
    }

    @Override
    public String info() {
        return ActivityConstants.WED_DISPLAY + super.info();
    }

    @Override
    String signUp() {
        return ActivityConstants.WED_DISPLAY + ActivityConstants.SWIMMING_INFO;
    }


    @Override
    String settle(boolean couldSignUp)
    {
        return ActivityConstants.WEEKEND_DISPLAY + super.settle(couldSignUp);

    }
}
