package com.dw.basic.demo.basicdemo.POJO.activities;

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
        this.price = ActivityConstants.MON_BOOKINGS_PRICE;
    }
    public Mondays(){
        super();
    }

    @Override
    public String info() {
        return ActivityConstants.MON_DISPLAY + super.info();

    }

    @Override
    String signUp() {
        return ActivityConstants.MON_DISPLAY + ActivityConstants.FISHING_INFO;

    }

    @Override
    String settle(boolean couldSignUp)
    {
        return ActivityConstants.MON_DISPLAY + super.settle(couldSignUp);

    }

}
