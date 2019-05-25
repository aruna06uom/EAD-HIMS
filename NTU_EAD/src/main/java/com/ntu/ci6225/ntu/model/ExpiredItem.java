package com.ntu.ci6225.ntu.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "expiredItem")
public class ExpiredItem {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	private String updateDate;
	private String updateBy;
	private String category;
	private String expiredDate;
	private String itemId;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getItemId() {
		return itemId;
	}

	public void setItemId(String itemId) {
		this.itemId = itemId;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public String getExpireDate() {
		return expiredDate;
	}

	public void setExpireDate(String expireDate) {
		this.expiredDate = expireDate;
	}
	
	public String getUpdateDate() {
		return updateDate;
	}

	public void setUpdateDate(String updateDate) {
		this.updateDate = updateDate;
	}

	public String getUpdateBy() {
		return updateBy;
	}

	public void setUpdateBy(String updateBy) {
		this.updateBy = updateBy;
	}

}
