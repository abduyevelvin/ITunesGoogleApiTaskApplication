package com.example.service;

import java.io.IOException;
import java.util.List;

import org.apache.http.client.ClientProtocolException;

import com.example.response.BookResponse;

/**
 * Java interface for getBooks method
 * Service layer
 * 
 * @author Abduyev Elvin
 * 
 */
public interface BookService {

	/** The method declaration for getBooks.
	 * @param text A string containing the search conditions.
	*/
	List<BookResponse> getBooks(String text) throws ClientProtocolException, IOException;
}
