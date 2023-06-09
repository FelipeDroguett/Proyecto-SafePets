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

import com.codingdojo.felipe.models.Foundation;
import com.codingdojo.felipe.services.AppService;


@Controller
public class UserController {

	@Autowired
	private AppService service;
	
	@GetMapping("/")
	public String index() {
		return "index.jsp";
	}
	

	@PostMapping("/register")
	public String register(@Valid @ModelAttribute("newUser") Foundation newUser,
						   BindingResult result,
						   HttpSession session,
						   Model model) {
		service.register(newUser, result);
		
		if(result.hasErrors()) {

			return "login.jsp";
		} else {

			session.setAttribute("userInSession", newUser);

			return "redirect:/Direction/newDirection";
		}
		
	}
	
	@PostMapping("/login")
	public String login(@RequestParam("email") String email,
						@RequestParam("password") String password,
						RedirectAttributes redirectAttributes,
						HttpSession session) {
		
		Foundation userLogin = service.login(email, password);
		
		if(userLogin == null) {

			redirectAttributes.addFlashAttribute("error_login", "Email/Contraseña incorrectos");

			return "redirect:/login";
		} else {

			session.setAttribute("userInSession", userLogin);
			return "redirect:/";
		}
	}

	@GetMapping("/register")
	public String Register( @ModelAttribute("newUser") Foundation newUser) {

		System.out.println(service.nodirectionFoundation());
		
		return "login.jsp";
	}
	@GetMapping("/membresia")
	public String membresia() {
		
		return "membresia.jsp";
	}
}

