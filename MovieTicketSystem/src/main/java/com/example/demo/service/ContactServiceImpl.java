package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;

import com.example.demo.dao.UserContactRepo;
import com.example.demo.model.ContactUs;

public class ContactServiceImpl implements ContactService {
	@Autowired
	private UserContactRepo conrepo;
	@Override
	public ContactUs SaveContactDetails(ContactUs con) {
		return conrepo.save(con);
	}

}
