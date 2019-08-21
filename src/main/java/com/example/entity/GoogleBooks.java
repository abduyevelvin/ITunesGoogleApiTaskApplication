package com.example.entity;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

/**
 * Java class convertible for Google books API
 * 
 * @author Abduyev Elvin
 * 
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class GoogleBooks {

	/** Represents the kind of fetched items.
	*/
	private String kind;
	/** Represents the total amount of fetched items.
	*/
	private int totalItems;
	/** Represents the fetched of books.
	*/
	private List<Book> items;
	/** Gets the kind of items.
	 * @return A string representing the kind of items.
	*/
	public String getKind() {
		return kind;
	}
	/** Sets the item's kind.
	 * @param kind A string containing the kind of items.
	*/
	public void setKind(String kind) {
		this.kind = kind;
	}
	/** Gets the total amount of items.
	 * @return An int representing the total amount of items.
	*/
	public int getTotalItems() {
		return totalItems;
	}
	/** Sets the item's total amount.
	 * @param kind An int containing the total amount of items.
	*/
	public void setTotalItems(int totalItems) {
		this.totalItems = totalItems;
	}
	/** Gets the list of books.
	 * @return A book list representing the books.
	*/
	public List<Book> getItems() {
		return items;
	}
	/** Sets the list of books.
	 * @param items A book list containing the books.
	*/
	public void setItems(List<Book> items) {
		this.items = items;
	}	
}
