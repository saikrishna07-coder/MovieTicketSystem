package com.example.demo.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.model.RegistrationDetails;

public interface RegistrationRepo extends JpaRepository<RegistrationDetails, String> {
	//RegistrationDetails is the model class name we have to mention it here so that out database can be connected and created acc to the model.

}
