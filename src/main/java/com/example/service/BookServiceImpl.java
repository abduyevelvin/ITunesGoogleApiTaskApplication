package com.example.service;

import java.io.IOException;
import java.util.List;

import org.apache.http.client.ClientProtocolException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.dao.BookDao;
import com.example.response.BookResponse;

/**
 * Java class implements BookService interface
 * Service layer
 * 
 * @author Abduyev Elvin
 * 
 */
@Service
public class BookServiceImpl implements BookService {
	
	@Autowired
	private BookDao bookDao;

	/**
	 * BookDao injected and used getBooks method for getting books.
	 * 
	 * @param text A string containing the search conditions.
	*/
	@Override
	public List<BookResponse> getBooks(String text) throws ClientProtocolException, IOException {
		
		return bookDao.getBooks(text);
	}

}
