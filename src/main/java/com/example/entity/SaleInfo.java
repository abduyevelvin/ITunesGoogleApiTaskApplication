package com.example.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

/**
 * Java class contains fields which is appropriate to JSON tag
 * Generated setter and getter methods of class fields
 * The class is the one field of Book class
 * 
 * @author Abduyev Elvin
 * 
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class SaleInfo {

	private String country;
	private String saleability;
	private Boolean isEbook;
	
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public String getSaleability() {
		return saleability;
	}
	public void setSaleability(String saleability) {
		this.saleability = saleability;
	}
	public Boolean getIsEbook() {
		return isEbook;
	}
	public void setIsEbook(Boolean isEbook) {
		this.isEbook = isEbook;
	}
	
}
