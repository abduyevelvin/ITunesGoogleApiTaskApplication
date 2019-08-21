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
public class PanelizationSummary {

	private Boolean containsEpubBubbles;
	private Boolean containsImageBubbles;
	
	public Boolean getContainsEpubBubbles() {
		return containsEpubBubbles;
	}
	public void setContainsEpubBubbles(Boolean containsEpubBubbles) {
		this.containsEpubBubbles = containsEpubBubbles;
	}
	public Boolean getContainsImageBubbles() {
		return containsImageBubbles;
	}
	public void setContainsImageBubbles(Boolean containsImageBubbles) {
		this.containsImageBubbles = containsImageBubbles;
	}
	
}
