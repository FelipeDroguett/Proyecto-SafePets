package com.codingdojo.felipe.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MembershipController {
	
	@GetMapping("/membgresia")
	private String membership() {
		
		return "membership.jsp";
	}
	
	@GetMapping("/evento")
	private String event() {
		
		return "event.jsp";
	}

}
