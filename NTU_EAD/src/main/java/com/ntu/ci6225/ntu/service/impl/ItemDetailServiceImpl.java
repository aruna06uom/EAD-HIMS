package com.ntu.ci6225.ntu.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ntu.ci6225.ntu.model.ItemDetails;
import com.ntu.ci6225.ntu.model.ItemsCount;
import com.ntu.ci6225.ntu.repository.ItemDetailsRepository;
import com.ntu.ci6225.ntu.service.ItemDetailService;

@Service
public class ItemDetailServiceImpl implements ItemDetailService {

	@Autowired
	private ItemDetailsRepository itemDetailsRepository;
	
	/*
	 * 
	 * @see com.ntu.ci6225.ntu.service.ItemDetailService#addItemDetails(com.ntu.ci6225.ntu.dto.ItemDetails)
	 */
	public boolean addItemDetails(ItemDetails itemDetails)
	{

		itemDetails.setStatus("live");
		
		ItemDetails itemDetailsEntityDB =itemDetailsRepository.save(itemDetails);
		if (itemDetailsEntityDB != null) {
	           return true;
         } else {
	        return true;
         }	
	}
	
	public List<ItemDetails> getAllItemsDetails(){
    List<ItemDetails> allItems = itemDetailsRepository.findAll();
		
		return allItems;
	}

	/*
	 * 
	 * @see com.ntu.ci6225.ntu.service.ItemDetailService#getAllItemsByCategory(java.lang.String)
	 */
	@Override
	public List<ItemDetails> getAllItemsByCategory(String category) {

		List<ItemDetails> allItems = itemDetailsRepository.findByCategory(category);
		
		return allItems;
	}

	@Override
	public ItemsCount getAllItems() {
		Long alldrugsExpired = itemDetailsRepository.countByCategoryAndStatus("drugs", "expired");
		Long alldrugsNonExpired = itemDetailsRepository.countByCategoryAndStatus("drugs", "live");
		Long allequipmentExpired= itemDetailsRepository.countByCategoryAndStatus("equipment", "expired");
		Long allequipmentNonExpired= itemDetailsRepository.countByCategoryAndStatus("equipment", "live");
		
		//List<itemsCount> allVal = new ArrayList<>();
		ItemsCount itemsCount = new ItemsCount();
		itemsCount.setAlldrugsExpired(alldrugsExpired);
		itemsCount.setAlldrugsNonExpired(alldrugsNonExpired);
		itemsCount.setAllequipmentExpired(allequipmentExpired);
		itemsCount.setAllequipmentNonExpired(allequipmentNonExpired);
		
		/*allVal.add(alldrugsExpired);
		allVal.add(alldrugsNonExpired);
		allVal.add(allequipmentExpired);
		allVal.add(allequipmentNonExpired);*/
		/*allVal.add(Long.valueOf(4));
		allVal.add(Long.valueOf(3));
		allVal.add(Long.valueOf(6));
		allVal.add(Long.valueOf(8));*/
		
		return itemsCount;
	}
	
}
