package com.example;

import java.io.IOException;

import org.apache.http.client.ClientProtocolException;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
//import org.springframework.context.ApplicationContext;

//import com.example.service.AlbumService;
//import com.example.service.BookService;

/**
 * Java class including main method for starting boot application
 * 
 * @author Abduyev Elvin
 * 
 */
@SpringBootApplication
public class LuxoftExampleApplication {
	
	public static void main(String[] args) throws ClientProtocolException, IOException {
		SpringApplication.run(LuxoftExampleApplication.class, args);
		//ApplicationContext context = SpringApplication.run(LuxoftExampleApplication.class, args);
		
		//AlbumService albumService = context.getBean(AlbumService.class);
		//BookService bookService = context.getBean(BookService.class);
		
		//String term = "jack johnson";
		
		//term = term.replaceAll(" ", "+");
		
		//albumService.getAlbums(term, 3);
		
		//bookService.getBooks("java");
	}
}