package com.example.entity;

import java.util.List;

public class ITunesAlbums {
	private int resultCount;
	private List<Album> results;
	
	public int getResultCount() {
		return resultCount;
	}
	public void setResultCount(int resultCount) {
		this.resultCount = resultCount;
	}
	public List<Album> getResults() {
		return results;
	}
	public void setResults(List<Album> results) {
		this.results = results;
	}
}
