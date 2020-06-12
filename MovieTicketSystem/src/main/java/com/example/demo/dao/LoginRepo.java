package com.example.demo.dao;

import org.springframework.data.jpa.repository.JpaRepository;



import com.example.demo.model.Login;

public interface LoginRepo extends JpaRepository<Login, String> {

}
