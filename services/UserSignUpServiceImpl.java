package com.lti.services;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lti.dao.SignUpRepository;
import com.lti.entity.UserSignUp;
import com.lti.exception.UserNotFound;

@Service
public class UserSignUpServiceImpl implements SignUpService {

	@Autowired
	private SignUpRepository sdao;
	
	@Override
	public UserSignUp addUser(UserSignUp user) {	
		return sdao.save(user);
	}

	@SuppressWarnings("deprecation")
	@Override
	public boolean checkCredential(String username, String password) throws UserNotFound {
		UserSignUp us;
		us = sdao.getById(username);
		String user = us.getUserName();
		String pwd = us.getPassword();
	
		System.out.println(pwd+""+password);
		if(pwd.equals(password) && user.equals(username)) {
			System.out.println("Login Success");
			return true;
		}
			throw new UserNotFound("User and password incorrect");
		}
		
	}

