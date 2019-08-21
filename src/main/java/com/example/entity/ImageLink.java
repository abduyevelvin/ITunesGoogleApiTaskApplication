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
public class ImageLink {

	private String smallThumbnail;
	private String thumbnail;
	
	public String getSmallThumbnail() {
		return smallThumbnail;
	}
	public void setSmallThumbnail(String smallThumbnail) {
		this.smallThumbnail = smallThumbnail;
	}
	public String getThumbnail() {
		return thumbnail;
	}
	public void setThumbnail(String thumbnail) {
		this.thumbnail = thumbnail;
	}
	
}
