package com.ntu.ci6225.ntu.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.ntu.ci6225.ntu.model.User;
import com.ntu.ci6225.ntu.repository.UserRepository;
import com.ntu.ci6225.ntu.service.UserService;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private UserRepository userRepository;
	public boolean addUser(User user) {
		User userVal = userRepository.save(user);
		if(userVal != null) {
			return true;
		}
		return false;
	}
	
	@Override
	public User findUser(String name) {
		User user = userRepository.findByName(name);
		return user;
	}
	
	@GetMapping(path = "/all")
	public @ResponseBody Iterable<User> getAllUsers() {
		return userRepository.findAll();
	}
}
