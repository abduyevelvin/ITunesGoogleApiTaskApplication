package com.example.service;

import java.io.IOException;
import java.util.List;

import org.apache.http.client.ClientProtocolException;

import com.example.response.BookResponse;

public interface BookService {

	List<BookResponse> getBooks(String text) throws ClientProtocolException, IOException;
}
