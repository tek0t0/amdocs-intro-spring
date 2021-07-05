package com.amdocs.springmvcex.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.amdocs.springmvcex.model.User;
import com.amdocs.springmvcex.repository.UserRepositoryImpl;

@Service

public class UserServiceImpl implements UserService {

	@Autowired
	UserRepositoryImpl userRepository;
	@Override
	public String addUser(User user) {
		return userRepository.addUser(user);		
	}

}
