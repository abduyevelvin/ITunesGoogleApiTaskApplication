package com.example.dao;

import java.io.IOException;
import java.util.List;

import org.apache.http.client.ClientProtocolException;

import com.example.response.BookResponse;

/**
 * Java interface for getBooks method
 * 
 * @author Abduyev Elvin
 * 
 */
public interface BookDao {

	/** The method declaration for getBooks.
	 * Throwing exceptions.
	 * 
	 * @param text A string containing the search conditions.
	*/
	List<BookResponse> getBooks(String text) throws ClientProtocolException, IOException;
}
