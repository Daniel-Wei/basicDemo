package com.dw.basic.demo.basicdemo.users;

import org.springframework.data.jpa.repository.JpaRepository;


public interface UserRepo extends JpaRepository<User, String> {

    User findByContactNumber(String contactNumber);
}

