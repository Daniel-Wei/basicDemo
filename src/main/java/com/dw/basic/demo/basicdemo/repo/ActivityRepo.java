package com.dw.basic.demo.basicdemo.repo;

import com.dw.basic.demo.basicdemo.POJO.activities.Activity;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

public interface ActivityRepo extends JpaRepository<Activity, Integer> {
    List<Activity> findBycDay(String cDay);
    List<Activity> findByeDay(String eDay);
}
