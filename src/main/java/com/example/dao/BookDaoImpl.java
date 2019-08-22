package com.example.dao;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.fluent.Request;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.example.entity.Book;
import com.example.entity.GoogleBooks;
import com.example.response.BookResponse;
import com.fasterxml.jackson.databind.ObjectMapper;

/**
 * Java class implements BookDao interface
 * 
 * @author Abduyev Elvin
 * 
 */
@Repository
public class BookDaoImpl implements BookDao {

	private final Logger logger = LoggerFactory.getLogger(AlbumDaoImpl.class);
	
	@Autowired
	private ObjectMapper mapper;

	/** The method getting books.
	 * Connecting to the API and getting books under searching conditions
	 * For logging used Logger
	 * ObjectMapper injected and used for converting JSON format to Java class
	 * 
	 * @param text A string containing the search conditions.
	*/
	@Override
	public List<BookResponse> getBooks(String text) throws ClientProtocolException, IOException {

		GoogleBooks googleBooks = null;
		List<Book> books = new ArrayList<Book>();
		List<BookResponse> bookResp = new ArrayList<BookResponse>();
		BookResponse resp = new BookResponse();

		Request request = Request.Get("https://www.googleapis.com/books/v1/volumes?q=" + text);
		String response = request.execute().returnContent().asString();

		googleBooks = mapper.readValue(response, GoogleBooks.class);

		books = googleBooks.getItems();

		for (Book book : books) {
			resp.setTitle(book.getVolumeInfo().getTitle());
			resp.setKind(book.getKind());
			resp.setAuthors(book.getVolumeInfo().getAuthors());

			bookResp.add(resp);
		}

		if(response == null) {
			logger.error("There is no album within entered searching conditions!");
		}
		else {
			logger.info(bookResp.toString());
		}

		return bookResp;
	}

}
