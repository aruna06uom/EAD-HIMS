package com.ntu.ci6225.ntu.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ntu.ci6225.ntu.model.ExpiredItem;
import com.ntu.ci6225.ntu.repository.ExpiredItemRepository;
import com.ntu.ci6225.ntu.service.ExpiredItemDetailService;

/*
 * all expiredItem service are handled
 */
@Service
public class ExpiredItemDetailServiceImpl implements ExpiredItemDetailService{

	@Autowired
	private ExpiredItemRepository expiredItemRepository;
	@Override
	public List<ExpiredItem> getAllIExpiredtemsByCategory(String category) {
		List<ExpiredItem> allItems = expiredItemRepository.findByCategory(category);
		
		return allItems;
	}
	
	@Override
	public List<ExpiredItem> getAllIExpiredtems() {
		List<ExpiredItem> allItems = expiredItemRepository.findAll();
		
		return allItems;
	}

}
