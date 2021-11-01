package com.rakib.contactservice.service;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import com.rakib.contactservice.entity.Contact;

@Service
public class ContactServiceImpl implements ContactService {

	List<Contact> contactList = Arrays.asList(
			new Contact(1, "867657623", "jawed@Gmail.com", 110),
			new Contact(2, "454657567", "mahi@Gmail.com", 110),
			new Contact(3, "235346577", "rajesh@Gmail.com", 111),
			new Contact(4, "875644655", "gopi@Gmail.com", 112),
			new Contact(6, "987655634", "suresh@Gmail.com", 113)
			
			);
	
	@Override
	public List<Contact> getAllContacts(Long userId) {
		return contactList.stream().filter(contact->contact.getUserId()==userId).collect(Collectors.toList());
	}

}
