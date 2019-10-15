package com.tringapps.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class UserController {

	@GetMapping("/admin")
	public String getUserName() throws Exception {
//		throw new Exception("All is well");
		return "HelloWorld Admin";
	}
	@GetMapping("/emp")
	public String getEmpName() throws Exception {
//		throw new Exception("All is well");
		return "HelloWorld Employee";
	}
}
