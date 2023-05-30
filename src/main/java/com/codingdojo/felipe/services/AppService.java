package com.codingdojo.felipe.services;

import org.mindrot.jbcrypt.BCrypt;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.validation.BindingResult;

import com.codingdojo.felipe.models.User;
import com.codingdojo.felipe.repositories.AllianceRepository;
import com.codingdojo.felipe.repositories.ApplicationRepository;
import com.codingdojo.felipe.repositories.DirectionRepository;
import com.codingdojo.felipe.repositories.FoundationRepository;
import com.codingdojo.felipe.repositories.PetRepository;
import com.codingdojo.felipe.repositories.UserRepository;

@Service
public class AppService {

	@Autowired
	private AllianceRepository allianceRepo;
	
	@Autowired
	private ApplicationRepository aplicationRepo;
	
	@Autowired
	private DirectionRepository directionRepo;
	
	@Autowired
	private FoundationRepository foundationRepo;
	
	@Autowired
	private PetRepository petRepo;
	
	@Autowired
	private UserRepository userRepo;
	
	
	public User register(User newUser, BindingResult result) {
		
		String email = newUser.getEmail();
		User isUser = userRepo.findByEmail(email); 
		if(isUser != null) {

			result.rejectValue("email", "Unique", "The email is already in use");
		}
		

		String password = newUser.getPassword();
		String confirm = newUser.getConfirm();
		if(!password.equals(confirm)) { 
			result.rejectValue("confirm", "Matches", "The passwords don't match");
		}
		
		if(result.hasErrors()) {
			return null;
		} else {
			
			String pass_encript = BCrypt.hashpw(newUser.getPassword(), BCrypt.gensalt());
			newUser.setPassword(pass_encript);
			return userRepo.save(newUser);
		}	
		
	}
	
	public User login(String email, String password) {
		
		User userExists = userRepo.findByEmail(email); 
		if(userExists == null) {
			return null;
		}
		
		
		if(BCrypt.checkpw(password, userExists.getPassword())) {
			return userExists;
		} else {
			return null;
		}
		
	}
	
}
