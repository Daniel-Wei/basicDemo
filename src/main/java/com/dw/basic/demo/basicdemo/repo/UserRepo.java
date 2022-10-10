package com.dw.basic.demo.basicdemo.repo;

import com.dw.basic.demo.basicdemo.POJO.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepo extends JpaRepository<User, String> {

    User findByContactNumber(String contactNumber);
}

