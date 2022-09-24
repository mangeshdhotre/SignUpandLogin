package com.lti.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.lti.entity.UserSignUp;
import com.lti.exception.UserNotFound;
import com.lti.services.SignUpService;

@RestController
public class SignUpController {

	@Autowired
	private SignUpService sService;
	
	@PostMapping("/usersignup")
	public UserSignUp addNewUser(@RequestBody UserSignUp us) {
		return sService.addUser(us);
	}
	@GetMapping("/login/{username}/{password}")
	public boolean checkCredential(@PathVariable("username") String username,@PathVariable("password") String password) throws UserNotFound {
		return sService.checkCredential(username, password);
		
	}
}
