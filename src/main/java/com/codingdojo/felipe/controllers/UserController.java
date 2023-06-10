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
import com.codingdojo.felipe.models.User;
import com.codingdojo.felipe.services.AppService;


@Controller
public class UserController {

	@Autowired
	private AppService service;
	
	@GetMapping("/")
	public String index() {
<<<<<<< HEAD

=======
    
>>>>>>> 05fc0fa3efe4ec7c4a908b323ed9101a60108f2b
		return "index.jsp";
	}
	

	@PostMapping("/register")
<<<<<<< HEAD
	public String register(@Valid @ModelAttribute("newUser") Foundation newUser,
						   BindingResult result,
						   HttpSession session,
						   Model model) {
		
		service.register(newUser, result);
		
		if(result.hasErrors()) {
=======
	public String register(@Valid @ModelAttribute("newUser") User newUser,
							BindingResult result,
							HttpSession session
							) {
		service.register(newUser, result);
		
		if(result.hasErrors()) {

>>>>>>> 05fc0fa3efe4ec7c4a908b323ed9101a60108f2b
			return "login.jsp";
		} else {

			session.setAttribute("userInSession", newUser);
<<<<<<< HEAD
			return "redirect:/Direction/newDirection";
=======
			return "redirect:/";
>>>>>>> 05fc0fa3efe4ec7c4a908b323ed9101a60108f2b
		}
		
	}
	
	@PostMapping("/login")
	public String login(@RequestParam("email") String email,
						@RequestParam("password") String password,
						RedirectAttributes redirectAttributes,
						HttpSession session) {
		
<<<<<<< HEAD

		Foundation userLogin = service.login(email, password);
		
		if(userLogin == null) {

			redirectAttributes.addFlashAttribute("error_login", "Email/Contraseña incorrectos");
=======
		User userLogin = service.login(email, password);
		
		if(userLogin == null) {

			redirectAttributes.addFlashAttribute("error_login", "Email/Password incorrect");
>>>>>>> 05fc0fa3efe4ec7c4a908b323ed9101a60108f2b
			return "redirect:/login";
		} else {

			session.setAttribute("userInSession", userLogin);
			return "redirect:/";
		}
	}

	@GetMapping("/register")
<<<<<<< HEAD
	public String Register( @ModelAttribute("newUser") Foundation newUser) {

		System.out.println(service.nodirectionFoundation());
		
		return "login.jsp";
	}
	
}

=======
	public String Register(@ModelAttribute("newUser") User newUser) {
		return "login.jsp";
	}

}
>>>>>>> 05fc0fa3efe4ec7c4a908b323ed9101a60108f2b

