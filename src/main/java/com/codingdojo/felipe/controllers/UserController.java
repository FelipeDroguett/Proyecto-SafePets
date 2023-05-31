package com.codingdojo.felipe.controllers;

import javax.servlet.http.HttpSession;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.codingdojo.felipe.models.User;
import com.codingdojo.felipe.services.AppService;


@Controller
public class UserController {

	@Autowired
	private AppService service;
	
	@GetMapping("/")
	
	public String Home() {
		
		return "home.jsp";
	}
	
	@GetMapping("/register")
	public String Register(@ModelAttribute("user") User user) {
		
		return "register.jsp";
	}
	
	
	
	@RequestMapping(value="/registration", method=RequestMethod.POST)
    public String registerUser(@Valid @ModelAttribute("user") User user, BindingResult result, HttpSession session) {
    	if(result.hasErrors()) {

        	session.setAttribute("errorRegister", "Ha ocurrido un error.");
    		return "redirect:/register";
    	}	
    	service.register(user, result);
    	session.setAttribute("successRegister", "Se ha registrado con éxito.");
    	
    	return "redirect:/";
    }
	
	@RequestMapping(value="/login", method=RequestMethod.POST)
    public String loginUser(@RequestParam("email") String email, @RequestParam("password") String password, Model model, HttpSession session) {
    	User user = service.login(email, password);
    	if(user != null) {
    		 session.setAttribute("user", user);
    		 return "redirect:/"; 
    	}
    	
    	return "redirect:/";
    }
}
