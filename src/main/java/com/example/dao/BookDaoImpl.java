package com.example.dao;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.fluent.Request;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.example.entity.Book;
import com.example.entity.GoogleBooks;
import com.example.response.BookResponse;
import com.fasterxml.jackson.databind.ObjectMapper;

@Repository
public class BookDaoImpl implements BookDao {

	@Autowired
	private ObjectMapper mapper;

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

		System.out.println(bookResp.toString());

		return bookResp;
	}

}
