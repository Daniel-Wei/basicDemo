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
        this.price = ActivityConstants.TUES_BOOKINGS_PRICE;
    }
    public Tuesdays(){
        super();
    }

    @Override
    public String info() {
        return ActivityConstants.TUES_DISPLAY + super.info();

    }

    @Override
    String signUp() {
        return ActivityConstants.TUES_DISPLAY + ActivityConstants.HIKING_INFO;
    }


    @Override
    String settle(boolean couldSignUp)
    {
        return ActivityConstants.TUES_DISPLAY + super.settle(couldSignUp);

    }
}
