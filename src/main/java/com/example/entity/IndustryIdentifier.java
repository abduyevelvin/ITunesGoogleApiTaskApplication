package com.example.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

/**
 * Java class contains fields which is appropriate to JSON tag
 * Generated setter and getter methods of class fields
 * The class is the one field of VolumeInfo class
 * 
 * @author Abduyev Elvin
 * 
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class IndustryIdentifier {

	private String type;
	private String identifier;
	
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getIdentifier() {
		return identifier;
	}
	public void setIdentifier(String identifier) {
		this.identifier = identifier;
	}
}
