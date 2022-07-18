package com.revature.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.revature.services.UserService;

@Controller	
//@Scope(value="prototype")
public class UserController {

//	@Autowired - Field Injection
	private UserService us;
	public String secret;
	
	@Autowired // Constructor Injection
	public UserController(UserService us) {
		this.us = us;
	}

	public UserService getUs() {
		return us;
	}

	// @Autowired - Setter Injection
	public void setUs(UserService us) {
		this.us = us;
	}
	
}
