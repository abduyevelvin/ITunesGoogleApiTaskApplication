package com.example;

import static com.jayway.restassured.RestAssured.get;
import static com.jayway.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.lessThan;
import static org.junit.Assert.assertNotNull;

import java.io.IOException;
import org.apache.http.client.ClientProtocolException;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.jayway.restassured.RestAssured;

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
		
		RestAssured.baseURI = "https://www.googleapis.com/books/v1/";
		String response = get("volumes?q=" + text).asString();
		
		System.out.println(response);
		
		assertNotNull(response);
	}
	
	/**
	 * The method for checking response time of API call
	 * 
	 */
	@Test
	public void checkResponseTime(){
		
		String text = "turing";
		
		RestAssured.baseURI = "https://www.googleapis.com/books/v1/";
				
		given().
		  parameters("q", text).
		when().
		  get("volumes").
		then().
		  body("items.volumeInfo.title[1]", equalTo("The Turing Test") ).
		  and().time(lessThan(60000L));
				
	}
}
