package com.dw.basic.demo.basicdemo.activities;

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
}
