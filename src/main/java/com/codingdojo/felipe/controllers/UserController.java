package com.codingdojo.felipe.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import com.codingdojo.felipe.services.AppService;

@Controller
public class UserController {

	@Autowired
	private AppService service;
	
	@GetMapping("/")
	
	public String Home() {
		
		return "home.jsp";
	}
}
