package com.example.entity;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

/**
 * Java class convertible for ITunes alum API
 * 
 * @author Abduyev Elvin
 * 
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class ITunesAlbums {
	
	/** Represents the count of albums fetched.
	*/
	private int resultCount;
	/** Results of fetched albums.
	*/
	private List<Album> results;
	/** Gets the album's count.
	 * @return An int representing the count of albums.
	*/
	public int getResultCount() {
		return resultCount;
	}
	/** Sets the album's count.
	 * @param resultCount An int containing the count of albums.
	*/
	public void setResultCount(int resultCount) {
		this.resultCount = resultCount;
	}
	/** Gets the list of albums.
	 * @return An album list representing the albums.
	*/
	public List<Album> getResults() {
		return results;
	}
	/** Sets the list of albums.
	 * @param results An album list containing the albums.
	*/
	public void setResults(List<Album> results) {
		this.results = results;
	}
}
