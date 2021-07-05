package com.amdocs.springmvcex.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.amdocs.springmvcex.model.Contact;
import com.amdocs.springmvcex.service.ContactService;

@Controller
public class ContactController {	
	
	@Autowired
	ContactService contactService;
	
	@RequestMapping(path="/addContact", method=RequestMethod.GET)
	public String addContact() {
		return "addContact";
	}
	
	@RequestMapping(path="/addContact", method=RequestMethod.POST)
	public String addContact(@ModelAttribute Contact contact) {
		contactService.addContact(contact);
		return "home";
	}
}
