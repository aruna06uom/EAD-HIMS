package com.ntu.ci6225.ntu.repository;


import org.springframework.data.repository.CrudRepository;

import com.ntu.ci6225.ntu.model.User;


/*
 * CRUD operations for 'User'
 */
public interface UserRepository extends CrudRepository<User, Integer> {

	public User findByName(String name);
}
