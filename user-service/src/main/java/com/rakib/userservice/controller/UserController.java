package com.rakib.userservice.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.rakib.userservice.entity.Contact;
import com.rakib.userservice.entity.User;
import com.rakib.userservice.service.UserService;

@RestController
@RequestMapping("/user")
public class UserController {

	@Autowired
	UserService userService;
	
	@Autowired
	RestTemplate restTemplate;
	
	@GetMapping("/{id}")
	public User getUser(@PathVariable("id") Long id) {
		User user = userService.getUser(id);
		
		List contacts = restTemplate.getForObject("http://CONTACT-SERVICE/contact/user/"+id, List.class);
		
		user.setContacts(contacts);
		
		return user;
	}
	
}
