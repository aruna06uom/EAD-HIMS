package com.ntu.ci6225.ntu.service;

import com.ntu.ci6225.ntu.model.User;

public interface UserService {

	public boolean addUser(User user);
	public User findUser(String name);
	Iterable<User> getAllUsers();
}
