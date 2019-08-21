package com.example.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

/**
 * Java class contains fields which is appropriate to JSON tag
 * Generated setter and getter methods of class fields
 * The class is the one field of AccessInfo class
 * 
 * @author Abduyev Elvin
 * 
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class Pdf {

	private String isAvailable;
	private String acsTokenLink;
	
	public String getIsAvailable() {
		return isAvailable;
	}
	public void setIsAvailable(String isAvailable) {
		this.isAvailable = isAvailable;
	}
	public String getAcsTokenLink() {
		return acsTokenLink;
	}
	public void setAcsTokenLink(String acsTokenLink) {
		this.acsTokenLink = acsTokenLink;
	}
	
}
