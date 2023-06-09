package com.codingdojo.felipe.controllers;

import javax.servlet.http.HttpSession;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.codingdojo.felipe.models.Alliance;
import com.codingdojo.felipe.services.AppService;

@Controller
public class AllianceController {

	@Autowired
	private AppService service;
	
	@PostMapping("/registry")
	public String register(@Valid @ModelAttribute("newUser") Alliance newUser,
						   BindingResult result,
						   HttpSession session,
						   Model model) {
		
		service.registry(newUser, result);
		
		if(result.hasErrors()) {
			return "signin.jsp";
		} else {

			session.setAttribute("userInSession", newUser);
			return "redirect:/Direction/alliDirection";
		}
		
	}
	
	@PostMapping("/signin")
	public String login(@RequestParam("email") String email,
						@RequestParam("password") String password,
						RedirectAttributes redirectAttributes,
						HttpSession session) {
		

		Alliance userLogin = service.signIn(email, password);
		
		if(userLogin == null) {

			redirectAttributes.addFlashAttribute("error_login", "Email/Contraseña incorrectos");
			return "redirect:/signin";
		} else {

			session.setAttribute("userInSession", userLogin);
			return "redirect:/";
		}
	}
	
	@GetMapping("/registry")
	public String joinregister(@ModelAttribute("newUser") Alliance newUser) {

		System.out.println("Entro a registry");
		
		return "signin.jsp";
	}
	
}
