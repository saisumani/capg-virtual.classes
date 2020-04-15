package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class Login {


	@GetMapping("/")
	public String showLoginPage()
	{
			return "loginPage";
	}
	
	@PostMapping("/login")
	public String showManagementPage(@RequestParam("username") String userName,
			@RequestParam("password") String passWord)
	{
		if(userName.equals("System") && passWord.equals("tiger"))
	    	return "traineeManagementPage";
		else
			return "404NotFound";
	}
	
}
