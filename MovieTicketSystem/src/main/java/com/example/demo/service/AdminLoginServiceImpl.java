package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.AdminLoginRepo;
import com.example.demo.model.AdminLogin;

@Service
public class AdminLoginServiceImpl implements AdminLoginService {
	@Autowired
	private AdminLoginRepo adminloginRepo;
	@Override
	public AdminLogin getAdminById(String aId) {
		return adminloginRepo.getOne(aId);
	}
}
