package com.example.dao;

import java.io.IOException;
import java.util.List;

import org.apache.http.client.ClientProtocolException;

import com.example.response.BookResponse;

public interface BookDao {

	List<BookResponse> getBooks(String text) throws ClientProtocolException, IOException;
}
