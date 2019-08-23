package com.example.controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.apache.http.client.ClientProtocolException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.exception.BookNotFoundException;
import com.example.response.BookResponse;
import com.example.service.BookService;

@RestController
@RequestMapping("/api")
public class BookController {

	@Autowired
	private BookService bookService;
	
	@GetMapping("/books")
	public ResponseEntity<List<BookResponse>> getBooks(@RequestParam String text) 
			throws ClientProtocolException, IOException {
		
		text = text.replaceAll(" ", "+");
		
		List<BookResponse> bookResp = new ArrayList<BookResponse>();
		
		try {
			bookResp = bookService.getBooks(text);
		} catch (Exception e) {
			
		}
		
		if(bookResp.isEmpty() || bookResp == null) {
			throw new BookNotFoundException("There is no book in given search conditions: " + text);
		}
		
		return ResponseEntity.ok().body(bookResp);
	}
}
