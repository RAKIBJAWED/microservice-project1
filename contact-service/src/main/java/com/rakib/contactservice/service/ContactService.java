package com.rakib.contactservice.service;

import java.util.List;

import com.rakib.contactservice.entity.Contact;

public interface ContactService {

	List<Contact> getAllContacts(Long userId);

}
