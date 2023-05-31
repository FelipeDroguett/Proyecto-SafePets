package com.codingdojo.felipe.controllers;

import javax.servlet.http.HttpSession;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
<<<<<<< HEAD
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;
=======
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
>>>>>>> 9cb575106ed3c61fbc627042292852ccd2bd998e

import com.codingdojo.felipe.models.User;
import com.codingdojo.felipe.services.AppService;


@Controller
public class UserController {

	@Autowired
	private AppService service;
	
	@GetMapping("/")
	
	public String Home(@ModelAttribute("newUser")User newUser) {
		
		return "home.jsp";
	}
	
<<<<<<< HEAD
	@PostMapping("/register")
	public String register(@Valid @ModelAttribute("newUser") User newUser,
						   BindingResult result,
						   HttpSession session
						   	) {
		

		service.register(newUser, result);
		
		if(result.hasErrors()) {
			return "home.jsp";
		} else {
			session.setAttribute("userInSession", newUser);
			return "redirect:/foundation";
		}
		
	}
	
	@PostMapping("/login")
	public String login(@RequestParam("email") String email,
						@RequestParam("password") String password,
						RedirectAttributes redirectAttributes,
						HttpSession session) {
		
		User userLogin = service.login(email, password);
		
		if(userLogin == null) {

			redirectAttributes.addFlashAttribute("error_login", "Email/Password incorrect");
			return "redirect:/";
		} else {
			session.setAttribute("userInSession", userLogin);
			return "redirect:/foundation";
		}	
	}
=======
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
>>>>>>> 9cb575106ed3c61fbc627042292852ccd2bd998e
}
