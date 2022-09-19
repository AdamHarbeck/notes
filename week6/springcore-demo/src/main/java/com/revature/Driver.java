package com.revature;

import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.revature.controllers.UserController;
import com.revature.services.UserService;

public class Driver {

	@Bean // indicates that the returned object will be managed by AC
	public Scanner getScanner() {
		return new Scanner(System.in);
	}
	
	public static void main(String[] args) {
		// Traditional way
		UserService us = new UserService();

		ApplicationContext ac = new ClassPathXmlApplicationContext("beans.xml");
		UserController uc = ac.getBean(UserController.class);
		uc.secret = "hello world";
		
		System.out.println(uc.secret);
		
		UserController uc1 = ac.getBean(UserController.class);
		System.out.println(uc1.secret);
	}

}
