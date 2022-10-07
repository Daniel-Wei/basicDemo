package com.dw.basic.demo.basicdemo.activities;

import com.dw.basic.demo.basicdemo.constants.ActivityConstants;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue(ActivityConstants.EWednesday)
public class Wednesdays extends Activity{
    public Wednesdays(String date) {
        super(date);
        this.category = ActivityConstants.SWIMMING;
        this.cDay = ActivityConstants.CWednesday;
        this.eDay = ActivityConstants.EWednesday;
    }
}
