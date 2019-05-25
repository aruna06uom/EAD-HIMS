package com.ntu.ci6225.ntu.service;

import java.util.List;

import com.ntu.ci6225.ntu.model.ItemDetails;
import com.ntu.ci6225.ntu.model.ItemsCount;

/*
 * 
 */
public interface ItemDetailService {

	public boolean addItemDetails(ItemDetails itemDetails);
	
	public List<ItemDetails> getAllItemsByCategory(String category);
	
	public List<ItemDetails> getAllItemsDetails();
	
	public ItemsCount getAllItems();
	
}
