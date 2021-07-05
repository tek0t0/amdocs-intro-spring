package com.amdocs.springmvcex.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.amdocs.springmvcex.model.Employee;
import com.amdocs.springmvcex.service.EmployeeService;

@Controller
public class RegisterController {
	
	@Autowired
	EmployeeService employeeService;

	@RequestMapping(path="/register", method = RequestMethod.GET)
	public String register() {
		return "register";
	}
	
	@RequestMapping(path="/register", method = RequestMethod.POST)
	public String registerPost(@ModelAttribute Employee employee) {
		
		employeeService.addEmployee(employee);
		return "home";
	}
}
