package com.dw.basic.demo.basicdemo.activities;

import com.dw.basic.demo.basicdemo.constants.ActivityConstants;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue(ActivityConstants.EMonday)
public class Mondays extends Activity{
    public Mondays(String date){
        super(date);
        this.category = ActivityConstants.FISHING;
        this.cDay = ActivityConstants.CMonday;
        this.eDay = ActivityConstants.EMonday;
    }
    public Mondays(){
        super();
    }
}
