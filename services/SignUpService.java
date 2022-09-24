package com.lti.services;

import com.lti.entity.UserSignUp;
import com.lti.exception.UserNotFound;

public interface SignUpService {
    public UserSignUp addUser(UserSignUp user);
    public boolean checkCredential(String username,String password) throws UserNotFound;
}
