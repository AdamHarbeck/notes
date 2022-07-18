package com.revature.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.revature.daos.UserDAO;

@Service
public class UserService {

	private UserDAO ud;

	@Autowired
	public UserService() {
		super();
	}
}
