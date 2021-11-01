package com.rakib.userservice.service;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

import com.rakib.userservice.entity.User;

@Service
public class UserServiceImpl implements UserService{
	
	List<User> userList = Arrays.asList(
			new User(110, "Rakib"),
			new User(111, "Mukesh"),
			new User(112, "Sumit"),
			new User(113, "Rahul"),
			new User(114, "Anand"),
			new User(115, "Murshid"),
			new User(116, "Mizan"),
			new User(117, "Sonu")
			);

	@Override
	public User getUser(Long userId) {
		return userList.stream().filter(user->user.getUserId()==userId).findAny().orElse(null);
	}

	
	
}
