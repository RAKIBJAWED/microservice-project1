package com.rakib.contactservice.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rakib.contactservice.entity.Contact;
import com.rakib.contactservice.service.ContactService;

@RestController
@RequestMapping("/contact")
public class ContactController {

	@Autowired
	ContactService contactService;
	
	@GetMapping("/user/{userId}")
	public List<Contact> getContact(@PathVariable("userId") Long userId){
		return contactService.getAllContacts(userId);
	}
}
