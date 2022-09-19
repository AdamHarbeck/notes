package com.revature.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HelloController {

	@RequestMapping(method= RequestMethod.GET, value="/hello")
//	@ResponseBody
	public String hello() {
		return "hello.html";
	}
	
	@RequestMapping(method= RequestMethod.GET, value="/goodbye")
	@ResponseBody
	public String goodbye() {
		return "Goodbye";
	}
}
