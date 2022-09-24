package com.lti.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.lti.entity.UserSignUp;

@Repository
public interface SignUpRepository extends JpaRepository<UserSignUp, String> {

}
