package com.ntu.ci6225.ntu.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import com.ntu.ci6225.ntu.model.ExpiredItem;


/*
 * CRUD operations for 'ExpiredItem'
 */
public interface ExpiredItemRepository extends JpaRepository<ExpiredItem, Integer> {
	
	public List<ExpiredItem>  findByCategory(String category);

}
