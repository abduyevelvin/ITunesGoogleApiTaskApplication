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
public class SearchInfo {

	private String textSnippet;

	public String getTextSnippet() {
		return textSnippet;
	}

	public void setTextSnippet(String textSnippet) {
		this.textSnippet = textSnippet;
	}
	
}
