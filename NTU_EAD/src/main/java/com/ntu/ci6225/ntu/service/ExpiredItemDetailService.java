package com.ntu.ci6225.ntu.service;

import java.util.List;

import com.ntu.ci6225.ntu.model.ExpiredItem;

/*
 * all expiredItem service are handled
 */
public interface ExpiredItemDetailService {
	
	public List<ExpiredItem> getAllIExpiredtemsByCategory(String category);
	public List<ExpiredItem> getAllIExpiredtems();

}
