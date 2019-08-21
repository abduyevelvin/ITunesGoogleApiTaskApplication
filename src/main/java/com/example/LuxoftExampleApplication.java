package com.example;

import java.io.IOException;

import org.apache.http.client.ClientProtocolException;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.example.service.AlbumService;
import com.example.service.BookService;

@SpringBootApplication
public class LuxoftExampleApplication {
	
	public static void main(String[] args) throws ClientProtocolException, IOException {
		ApplicationContext context = SpringApplication.run(LuxoftExampleApplication.class, args);
		
		AlbumService albumService = context.getBean(AlbumService.class);
		BookService bookService = context.getBean(BookService.class);
		
		String term = "jack johnson";
		
		term = term.replaceAll(" ", "+");
		
		albumService.getAlbums(term, 3);
		
		bookService.getBooks("java");
	}
}