package com.dw.basic.demo.basicdemo.POJO.activities;

import com.dw.basic.demo.basicdemo.constants.ActivityConstants;

public class ActivityFactory {

    public ActivityFactory()
    {

    }

    public Activity create(int type, String date)
    {
        switch(type){
            case ActivityConstants.MON:
                Mondays Mon = new Mondays(date);
                return Mon;
            case ActivityConstants.TUES:
                Tuesdays Tues = new Tuesdays(date);
                return Tues;
            case ActivityConstants.WED:
                Wednesdays Wed = new Wednesdays(date);
                return Wed;
            case ActivityConstants.WEEKEND:
                Weekends Weekend = new Weekends(date);
                return Weekend;
            case ActivityConstants.FRI:
                Fridays Fri = new Fridays(date);
                return Fri;

            /*
            need modifications
             */
            default:
                System.out.println("wrong input");
        }
        return null;
    }

}
