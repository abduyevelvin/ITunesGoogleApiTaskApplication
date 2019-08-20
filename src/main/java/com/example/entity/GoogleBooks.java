package com.example.entity;

import java.util.List;

public class GoogleBooks {

	private String kind;
	private String totalItems;
	private List<Book> items;
	
	public String getKind() {
		return kind;
	}
	public void setKind(String kind) {
		this.kind = kind;
	}
	public String getTotalItems() {
		return totalItems;
	}
	public void setTotalItems(String totalItems) {
		this.totalItems = totalItems;
	}
	public List<Book> getItems() {
		return items;
	}
	public void setItems(List<Book> items) {
		this.items = items;
	}	
}
