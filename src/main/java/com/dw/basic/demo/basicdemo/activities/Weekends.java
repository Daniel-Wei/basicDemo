package com.dw.basic.demo.basicdemo.activities;

import com.dw.basic.demo.basicdemo.constants.ActivityConstants;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue(ActivityConstants.EWeekends)
public class Weekends extends Activity{
    public Weekends(String date) {
        super(date);
        this.category = ActivityConstants.SKYDIVING;
        this.cDay = ActivityConstants.CWeekends;
        this.eDay = ActivityConstants.EWeekends;
    }

    public Weekends(){
        super();
    }
}
