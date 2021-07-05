package com.amdocs.springmvcex.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.amdocs.springmvcex.model.Contact;
import com.amdocs.springmvcex.repository.ContactRepository;

@Service

public class ContactServiceImpl implements ContactService {

	@Autowired
	ContactRepository contactRepository;
	@Override
	public String addContact(Contact contact) {
		return contactRepository.addContact(contact);		
	}

}
