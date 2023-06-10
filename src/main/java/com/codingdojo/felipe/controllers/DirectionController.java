package com.codingdojo.felipe.controllers;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.codingdojo.felipe.models.Alliance;
import com.codingdojo.felipe.models.Direction;
import com.codingdojo.felipe.models.Foundation;
import com.codingdojo.felipe.services.AppService;

@Controller
public class DirectionController {

	@Autowired
	private AppService service;
	
	
	@GetMapping("/Direction/newDirection")
	public String nuevaDireccion(@ModelAttribute("direction") Direction direction, Model model) {
		
		List<Foundation> listaUsuario = service.nodirectionFoundation();
		
		model.addAttribute("foundations", listaUsuario);
		

		
		return"/Direction/newDirection.jsp";
	}
	
	@PostMapping("/Direction/create")
	public String crearDirecciones(@Valid @ModelAttribute("direction") Direction directionNew, BindingResult result, Model model) {
		
		if(result.hasErrors()) {
			
			List<Foundation> listaUsuario = service.nodirectionFoundation();
			model.addAttribute("foundations", listaUsuario);
			

			
			return"/Direction/newDirection.jsp";
		}else {
			service.saveDirection(directionNew);
			return "redirect:/";
		}
	}
	
	@GetMapping("/Direction/alliDirection")
	public String alliDireccion(@ModelAttribute("direction") Direction direction, Model model) {
		
		
		List<Alliance> listaAlliance = service.nodirectionAlliance();
		model.addAttribute("alliances", listaAlliance);
		
		return"/Direction/alliDirection.jsp";
	}
	
	@PostMapping("/Direction/creat")
	public String creaDirecciones(@Valid @ModelAttribute("direction") Direction directionnew, BindingResult result, Model model) {
		
		if(result.hasErrors()) {
			
			
			List<Alliance> listaAlliance = service.nodirectionAlliance();
			model.addAttribute("alliances", listaAlliance);
			
			return"/Direction/alliDirection.jsp";
		}else {
			service.saveDirection(directionnew);
			return "redirect:/";
		}
	}
	
}
