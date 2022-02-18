package com.laptop.springboot.service;

import org.springframework.security.core.userdetails.UserDetailsService;

import com.laptop.springboot.model.User;
import com.laptop.springboot.model.UserRegistrationDto;

public interface UserService extends UserDetailsService{
	User save(UserRegistrationDto registrationDto);

	User getUserDetails(String username);
}
