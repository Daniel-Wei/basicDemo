package com.dw.basic.demo.basicdemo.activities;
import com.dw.basic.demo.basicdemo.constants.ActivityConstants;

public class ActivityFactory {

    public ActivityFactory()
    {

    }

    public Activity create(int type, String date)
    {
        switch(type){
            case ActivityConstants.Monday:
                Mondays Mon = new Mondays(date);
                return Mon;
            case ActivityConstants.Tuesday:
                Tuesdays Tues = new Tuesdays(date);
                return Tues;
            case ActivityConstants.Wednesday:
                Wednesdays Wed = new Wednesdays(date);
                return Wed;
            case ActivityConstants.Weekends:
                Weekends Weekend = new Weekends(date);
                return Weekend;
            case ActivityConstants.Friday:
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
