package com.ntu.ci6225.ntu.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

import com.ntu.ci6225.ntu.model.ItemDetails;

/*
 * CRUD operations for 'ItemDetails'
 */
public interface ItemDetailsRepository extends JpaRepository<ItemDetails,Long> {
	
	public List<ItemDetails>  findByCategory(String category);
	public Long countByCategoryAndStatus(String category, String status);

}
