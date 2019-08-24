package com.example.dao;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.SocketTimeoutException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.apache.http.client.ClientProtocolException;
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

	/**
	 * The method getting books. Connecting to the API and getting books under
	 * searching conditions For logging used Logger ObjectMapper injected and used
	 * for converting JSON format to Java class
	 * 
	 * @param text A string containing the search conditions.
	 */
	@Override
	public List<BookResponse> getBooks(String text) throws ClientProtocolException, IOException {

		GoogleBooks googleBook = null;
		List<Book> books = new ArrayList<Book>();
		List<BookResponse> booksResponse = new ArrayList<BookResponse>();
		StringBuilder sb = new StringBuilder();
		String output;
		int counter = 0;

		URL url = new URL("https://www.googleapis.com/books/v1/volumes?q=" + text);
		HttpURLConnection req = (HttpURLConnection) url.openConnection();
		req.connect();

		try {
			BufferedReader br = new BufferedReader(new InputStreamReader((req.getInputStream())));
			while ((output = br.readLine()) != null) {
				sb.append(output);
			}

			req.setConnectTimeout((int) TimeUnit.SECONDS.toMinutes(60L));
			req.setReadTimeout((int) TimeUnit.SECONDS.toMinutes(60L));
		} catch (SocketTimeoutException e) {
			logger.error("Response time is longer");
		}

		String response = sb.toString();

		googleBook = mapper.readValue(response, GoogleBooks.class);

		books = googleBook.getItems();

		for (Book b : books) {
			BookResponse bookResponse = new BookResponse();
			bookResponse.setTitle(b.getVolumeInfo().getTitle());
			bookResponse.setKind(b.getKind());
			bookResponse.setAuthors(b.getVolumeInfo().getAuthors());

			booksResponse.add(bookResponse);
			counter++;
			
			if(counter == 5) {
				break;
			}
		}

		if (response == null) {
			logger.error("There is no album within entered searching conditions!");
		} else {
			logger.info(booksResponse.toString());
		}
		
		Collections.sort(booksResponse);

		return booksResponse;
	}

}
