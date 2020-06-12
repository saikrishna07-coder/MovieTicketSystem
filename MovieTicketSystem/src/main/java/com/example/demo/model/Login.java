package com.example.demo.model;

import javax.persistence.Entity;
import javax.persistence.Id;
@Entity
public class Login {

	@Id
	private String uId;
	private String uPassword;
	
	public String getuId() {
		return uId;
	}
	public void setuId(String string) {
		this.uId = string;
	}
	public String getuPassword() {
		return uPassword;
	}
	public void setuPassword(String uPassword) {
		this.uPassword = uPassword;
	}
	@Override
	public String toString() {
		return "Login [uId=" + uId + ", uPassword=" + uPassword + "]";
	}
}
