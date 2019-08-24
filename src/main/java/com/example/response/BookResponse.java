package com.example.response;

import java.util.List;

/**
 * Java class for giving response to the end user.
 * Generated setter and getter methods of class fields
 * 
 * @author Abduyev Elvin
 * 
 */
public class BookResponse implements Comparable<BookResponse> {

	/** Represents the title of books.
	*/
	private String title;
	/** Represents the authors list of books.
	*/
	private List<String> authors;
	/** Represents the kind of data.
	*/
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
	
	/** 
	 * The method for ordering result regarding book title
	 * 
	 * @param BookResponse accepting books
	 * @return ordered books by title
	 */
	@Override
	public int compareTo(BookResponse response) {
		int order = this.title.compareTo(response.title);
		return order;
	}
	
	@Override
	public String toString() {
		return "BookResponse [title=" + title + ", authors=" + authors + ", kind=" + kind + "]";
	}
	
}
