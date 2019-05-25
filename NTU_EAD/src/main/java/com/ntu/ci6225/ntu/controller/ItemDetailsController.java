package com.ntu.ci6225.ntu.controller;

import com.ntu.ci6225.ntu.model.ItemDetails;
import com.ntu.ci6225.ntu.model.ItemsCount;
import com.ntu.ci6225.ntu.service.ItemDetailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

/*
 * Controller for ItemDetails
 */
@RestController
@RequestMapping(path = "api/items")
public class ItemDetailsController {
	
	static final ObjectMapper mapper = new ObjectMapper();
	Map<String, Object> map  = new HashMap<String, Object>();

	@Autowired
	private ItemDetailService itemDetailService;

	@RequestMapping(value = "/submitItems", method = RequestMethod.POST)
	public String submitItems(@RequestBody ItemDetails itemDetails, HttpServletRequest request) throws JsonProcessingException {
		
		
		try {
			itemDetailService.addItemDetails(itemDetails);
		} catch (Exception ex) {

		}
		map.put("data", "successfully insert in to the database!!!");
		return mapper.writeValueAsString(map);
	}
	
	
	@GetMapping(path = "/")
	public @ResponseBody List<ItemDetails> loadDetails(@RequestParam String category) throws JsonProcessingException {

		List<ItemDetails> detailsList = null;
		try {
			detailsList =itemDetailService.getAllItemsByCategory(category);
		} catch (Exception ex) {

		}
		return detailsList;
	}
	
	@GetMapping(path = "/load")
	public  ItemsCount loadAllDetails() throws JsonProcessingException {

		ItemsCount detailsList = null;
		try {
			detailsList =itemDetailService.getAllItems();
		} catch (Exception ex) {

		}
		return detailsList;
	}
	
	@GetMapping("/itemDetailsAll")
	public  List<ItemDetails> loadAllItemDetails() throws JsonProcessingException {

		List<ItemDetails> detailsList = null;
		try {
			detailsList =itemDetailService.getAllItemsDetails();
		} catch (Exception ex) {

		}
		return detailsList;
	}
	

}
