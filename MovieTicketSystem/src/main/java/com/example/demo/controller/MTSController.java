package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.demo.dao.RegistrationRepo;
import com.example.demo.dao.UserContactRepo;
import com.example.demo.model.RegistrationDetails;
import com.example.demo.model.AdminLogin;
import com.example.demo.model.ContactUs;
import com.example.demo.model.Login;
import com.example.demo.service.AdminLoginServiceImpl;
import com.example.demo.service.ContactServiceImpl;
import com.example.demo.service.UserServiceImpl;

@Configuration
@ComponentScan("com.example.demo.service")
@Controller
public class MTSController {
	
	@Autowired
	UserServiceImpl userserimpl;
	
	@Autowired
	RegistrationRepo registrationRepo;
	
	@Autowired
	ContactServiceImpl contactimpl;
	
	@Bean
	UserServiceImpl userserimp()
	{
		return new UserServiceImpl();
	} 
	
	@Bean
	ContactServiceImpl contactimp()
	{
		return new ContactServiceImpl();
	} 
	
	@RequestMapping("home") 
	  public String UserRegs() 
	  { 
		  return "home"; 
	  }
	 
	@Autowired
    AdminLoginServiceImpl adminLoginServiceImpl; 
	
	@RequestMapping("reg")
	public String Register()
	{ 
		return "UserReg";
	}
	
   @RequestMapping("UReg")
   public String UserReg(@ModelAttribute("registrationDetails")RegistrationDetails regdet)
   {   userserimpl.SaveCustomerDetails(regdet);
	   return "login";
   }
   
   @RequestMapping("logs")//this tells that the data is coming from login page bcz the mapping is log which is of login page
   public String UserLogin(@ModelAttribute("registration")RegistrationDetails reg,ModelMap modelMap)
   {   System.out.println(reg.getUserid()+reg.getPassword());
	   try {
			 String userid = userserimpl.getCustomerById(reg.getUserid()).getUserid();// the data in the bracket is coming from the login session , first when user enter the credential into 
			 //login that data is stored into reg and from there we will get the data and compared with the database.
			 if(!reg.getPassword().equals(userserimpl.getCustomerById(reg.getUserid()).getPassword())){ //left side one is session
				 String msg2 =  "password is not correct";
				 System.out.println("msg2");
				 modelMap.addAttribute("msg2", msg2);
				 return "login";
			 } 
			 else {
				 System.out.println("Successfully Login!!!"+userid+" and password:"+reg.getPassword());
				 String umsg ="\nYou have successfully Logged in with UserId:  " + userid;
					modelMap.addAttribute("umsg", umsg);
				 return "dashboard";
				 }
		} catch (Exception e) {
			String msg = reg.getUserid() + " Does not exist in the db";
			modelMap.addAttribute("msg", msg);
			return "login";
		} 
   }
   
	
	  @RequestMapping("log") 
	  public String UserLogin() { 
		  return "login"; 
		  }
	  
	  @RequestMapping("seatsel")
	  public String SeatBook()
	  {
		  return "seatselection";
	  }
	  
	  @RequestMapping("adminloginform")
		public String landingIntoPortal(@ModelAttribute("adminLogin")AdminLogin adminLogin, ModelMap modelMap) { 
			 try {
				 String userid = adminLoginServiceImpl.getAdminById(adminLogin.getaId()).getaId();
				 System.out.println(userid);
				 if(!adminLogin.getaPassword().equals(adminLoginServiceImpl.getAdminById(adminLogin.getaId()).getaPassword())){
					// System.out.println("hello");
					 String msg =  "password is not correct";
					 System.out.println("msg");
					 modelMap.addAttribute("msg", msg);
					 return "adminlogin";
				 } 
				 else {
					 System.out.println("Successfully Login!!!"+userid+" and password:"+adminLogin.getaPassword());
					 String amsg ="\nYou have successfully Logged in with UserId:  " + userid;
					 modelMap.addAttribute("amsg", amsg);
					 return "admindash";
					 }
			} catch (Exception e) {
				String msg1 = adminLogin.getaId() + " Does not exist in the db";
				modelMap.addAttribute("msg1", msg1);
				return "adminlogin";
			} 
		}
	   
	  @RequestMapping("contact")
	  public String contactusform()
	  {
		  return "contactus";
	  }
	  
	  @RequestMapping("contactUsdata")
	  public String ContactForm(@ModelAttribute("contactUs")ContactUs conus)
	  {
		  contactimpl.SaveContactDetails(conus);
		  return "contactus";
	  }
}
