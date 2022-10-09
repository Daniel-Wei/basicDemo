package com.dw.basic.demo.basicdemo.activities;

import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;


import java.util.List;

public interface ActivityRepo extends JpaRepository<Activity, Integer> {
    List<Activity> findBycDay(String cDay);
    List<Activity> findByeDay(String eDay);






}
