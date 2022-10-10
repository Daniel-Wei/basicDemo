package com.dw.basic.demo.basicdemo.POJO.activities;

import com.dw.basic.demo.basicdemo.constants.ActivityConstants;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue(ActivityConstants.ETuesday)
public class Tuesdays extends Activity{
    public Tuesdays(String date) {
        super(date);
        this.category = ActivityConstants.HIKING;
        this.cDay = ActivityConstants.CTuesday;
        this.eDay = ActivityConstants.ETuesday;
    }
    public Tuesdays(){
        super();
    }
}
