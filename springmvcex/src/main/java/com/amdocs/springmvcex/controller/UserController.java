package com.amdocs.springmvcex.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.amdocs.springmvcex.model.User;
import com.amdocs.springmvcex.service.UserService;


@Controller
public class UserController {

	@Autowired
	UserService userService;
	
	@RequestMapping(path="/userRegister", method=RequestMethod.GET)
	public String userRegister() {
		return "userRegister";
	}
	
	@RequestMapping(path="/userRegister", method=RequestMethod.POST)
	public String userRegister(@ModelAttribute User user) {
		userService.addUser(user);
		return "home";
	}
}
