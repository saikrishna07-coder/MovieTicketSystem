package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;

import com.example.demo.dao.RegistrationRepo;
import com.example.demo.model.RegistrationDetails;

public class UserServiceImpl implements UserService {
    
	@Autowired
	private RegistrationRepo regrepo;
	
	public RegistrationRepo getRegistrationRepo() {
		return regrepo;
	}
	
	public void setRegistrationRepo(RegistrationRepo regrepo) {
		this.regrepo=regrepo;
	}
	
	@Override
	public RegistrationDetails SaveCustomerDetails(RegistrationDetails reg) {
		// TODO Auto-generated method stub
		return regrepo.save(reg);
	}

	@Override
	public RegistrationDetails getCustomerById(String userid) {
		// TODO Auto-generated method stub
		return regrepo.getOne(userid);
		
	}

}
