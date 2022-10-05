package com.dw.basic.demo.basicdemo.activities;


import lombok.Data;
import org.hibernate.annotations.DynamicInsert;
import org.hibernate.annotations.DynamicUpdate;

import javax.persistence.*;

@Data
@Entity
@DynamicInsert
@DynamicUpdate
@Table(name = "activity")
public class Activity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String name;

    private String  date;

    private String eDay;

    private String cDay;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String geteDay() {
        return eDay;
    }

    public void seteDay(String eDay) {
        this.eDay = eDay;
    }

    public String getcDay() {
        return cDay;
    }

    public void setcDay(String cDay) {
        this.cDay = cDay;
    }

    public Activity()
    {

    }




}
