package com.codingdojo.felipe.services;

import java.util.List;

import org.mindrot.jbcrypt.BCrypt;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.validation.BindingResult;

import com.codingdojo.felipe.models.Alliance;
import com.codingdojo.felipe.models.Direction;
import com.codingdojo.felipe.models.Foundation;
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
	
	
	public Foundation register(Foundation newUser, BindingResult result) {
		
		String email = newUser.getEmail();
		Foundation isUser = foundationRepo.findByEmail(email);
		if(isUser != null) {
			
			result.rejectValue("email", "Unique", "El correo electrónico ya está en uso.");
		}
		

		String password = newUser.getPassword();
		String confirm = newUser.getConfirm();
		if(!password.equals(confirm)) { 

			result.rejectValue("confirm", "Matches", "Las contraseñas no coinciden");
		}
		

		if(result.hasErrors()) {
			return null;
		} else {

			String pass_encript = BCrypt.hashpw(newUser.getPassword(), BCrypt.gensalt());
			newUser.setPassword(pass_encript);
			return foundationRepo.save(newUser);
		}	
		
	}
	
	public Foundation login(String email, String password) {
		
		Foundation userExists = foundationRepo.findByEmail(email); 
		if(userExists == null) {
			return null;
		}
		
		
		if(BCrypt.checkpw(password, userExists.getPassword())) {
			return userExists;
		} else {
			return null;
		}
		
	}

	public Foundation findFoundation(Long id) {
		return foundationRepo.findById(id).orElse(null);
	}

	public User findByEmail(String email) {
        return userRepo.findByEmail(email);
    }

	public Direction saveDirection(Direction directionNew) {
		return directionRepo.save(directionNew);
	}
	
<<<<<<< HEAD
	public List<Foundation> nodirectionFoundation(){
		return foundationRepo.findByDirectionIdIsNull();
	}
	
	public List<Foundation> findFoundations(){
		return foundationRepo.findAll();
	}
	
	
	public List<Alliance> nodirectionAlliance(){
		return allianceRepo.findByDirectionIdIsNull();
	}
	
	public Alliance findAlliance(Long id) {
		return allianceRepo.findById(id).orElse(null);
	}
	
	public List<Alliance> findAlliance(){
		return allianceRepo.findAll();
	}
	
	
	
	
	
	
	public Alliance registry(Alliance newUser, BindingResult result) {
		
		String email = newUser.getEmail();
		Alliance isUser = allianceRepo.findByEmail(email);
		if(isUser != null) {
			
			result.rejectValue("email", "Unique", "El correo electrónico ya está en uso.");
		}
		

		String password = newUser.getPassword();
		String confirm = newUser.getConfirm();
		if(!password.equals(confirm)) { 

			result.rejectValue("confirm", "Matches", "Las contraseñas no coinciden");
		}
		

		if(result.hasErrors()) {
			return null;
		} else {

			String pass_encript = BCrypt.hashpw(newUser.getPassword(), BCrypt.gensalt());
			newUser.setPassword(pass_encript);
			return allianceRepo.save(newUser);
		}	
		
	}
	
	public Alliance signIn(String email, String password) {
		
		Alliance userExists = allianceRepo.findByEmail(email); 
		if(userExists == null) {
			return null;
		}
		
		
		if(BCrypt.checkpw(password, userExists.getPassword())) {
			return userExists;
		} else {
			return null;
		}
		
	}
		
=======
	public User findByEmail(String email) {
        return userRepo.findByEmail(email);
    }
	
>>>>>>> 05fc0fa3efe4ec7c4a908b323ed9101a60108f2b
}
