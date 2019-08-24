package com.example;

import java.io.IOException;

import javax.annotation.PostConstruct;

import org.apache.http.client.ClientProtocolException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

//import org.springframework.context.ApplicationContext;
import com.example.config.TaskProperties;

//import com.example.service.AlbumService;
//import com.example.service.BookService;

/**
 * Java class including main method for starting boot application
 * Injecting properties for checking which profile is activated in application.properties file
 * 
 * @author Abduyev Elvin
 * 
 */
@SpringBootApplication
public class ITunesGoogleApiTaskApplication {
	
	private static Logger logger = LoggerFactory.getLogger(ITunesGoogleApiTaskApplication.class);
	
	@Autowired
    private TaskProperties taskProperties;
	
	public static void main(String[] args) throws ClientProtocolException, IOException {
		SpringApplication.run(ITunesGoogleApiTaskApplication.class, args);
		//ApplicationContext context = SpringApplication.run(ITunesGoogleApiTaskApplication.class, args);
		
		//AlbumService albumService = context.getBean(AlbumService.class);
		//BookService bookService = context.getBean(BookService.class);
		
		//String term = "jack johnson";
		
		//term = term.replaceAll(" ", "+");
		
		//albumService.getAlbums(term, 3);
		
		//bookService.getBooks("java");
	}
	
	@PostConstruct
    public void init() {
 
        logger.info(taskProperties.toString());
    }
}