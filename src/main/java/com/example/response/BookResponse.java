package com.example.response;

import java.util.List;

public class BookResponse {

	private String title;
	private List<String> authors;
	private String kind;
	
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public List<String> getAuthors() {
		return authors;
	}
	public void setAuthors(List<String> authors) {
		this.authors = authors;
	}
	public String getKind() {
		return kind;
	}
	public void setKind(String kind) {
		this.kind = kind;
	}
	
	@Override
	public String toString() {
		return "BookResponse [title=" + title + ", authors=" + authors + ", kind=" + kind + "]";
	}
	
}
