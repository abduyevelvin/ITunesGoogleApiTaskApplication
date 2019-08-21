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
public class Epub {

	private Boolean isAvailable;

	public Boolean getIsAvailable() {
		return isAvailable;
	}

	public void setIsAvailable(Boolean isAvailable) {
		this.isAvailable = isAvailable;
	}
	
}
