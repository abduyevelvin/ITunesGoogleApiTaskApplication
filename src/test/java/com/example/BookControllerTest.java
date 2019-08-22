package com.example;

import static org.junit.Assert.assertNotNull;

import java.io.IOException;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.fluent.Request;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * Java test class for testing book REST service
 * 
 * @author Abduyev Elvin
 * 
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class BookControllerTest {

	/**
	 * The method for checking the result of API call for getting books in given search conditions
	 * @throws ClientProtocolException
	 * @throws IOException
	 */
	@Test
	public void getBooksGivenSerachConditions() throws ClientProtocolException, IOException {
		String text = "java";
		
		Request request = Request.Get("https://www.googleapis.com/books/v1/volumes?q=" + text);
		String response = request.execute().returnContent().asString();
		
		assertNotNull(response);
	}
}
