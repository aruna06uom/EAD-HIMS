package com.ntu.ci6225.ntu.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.ntu.ci6225.ntu.model.ExpiredItem;
import com.ntu.ci6225.ntu.model.ItemDetails;
import com.ntu.ci6225.ntu.service.ExpiredItemDetailService;

/*
 * Controller for DashBoardView
 */
@RestController
@RequestMapping(path = "api/expiredItems")
public class ExpiredItemsController {

	@Autowired
	ExpiredItemDetailService expiredItemDetailService;
	
	/*
	 * get All expired items by category
	 */
	@GetMapping(path = "/")
	public  List<ExpiredItem> loadDetails(@RequestParam String category) throws JsonProcessingException {

		List<ExpiredItem> detailsList = null;
		try {
			detailsList =expiredItemDetailService.getAllIExpiredtemsByCategory(category);
		} catch (Exception ex) {

		}
		return detailsList;
	}
	
	@GetMapping("/loadDetails")
	public  List<ExpiredItem> loadAllItemDetails() throws JsonProcessingException {

		List<ExpiredItem> detailsList = null;
		try {
			detailsList =expiredItemDetailService.getAllIExpiredtems();
		} catch (Exception ex) {

		}
		return detailsList;
	}

}
