package com.example.demo.service;

import com.example.demo.model.RegistrationDetails;

public interface UserService {
  public RegistrationDetails SaveCustomerDetails(RegistrationDetails reg);
  public RegistrationDetails getCustomerById(String userid);
}
