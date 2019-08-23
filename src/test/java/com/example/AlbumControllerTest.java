package com.example;

import static com.jayway.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.lessThan;
import static org.junit.Assert.assertThat;

import java.io.IOException;

import org.apache.http.HttpResponse;
import org.apache.http.HttpStatus;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpUriRequest;
import org.apache.http.impl.client.HttpClientBuilder;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.jayway.restassured.RestAssured;

/**
 * Java test class for testing album REST service
 * 
 * @author Abduyev Elvin
 * 
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class AlbumControllerTest {

	/**
	 * The method for checking status code of API call for getting albums in given
	 * serach conditions
	 * 
	 * @throws ClientProtocolException
	 * @throws IOException
	 */
	@Test
	public void getAlbumsGivenSerachConditions() throws ClientProtocolException, IOException {

		String term = "jack+johnson";
		Integer limit = 5;

		HttpUriRequest httpRequest = new HttpGet("https://itunes.apple.com/search?term=" + term + "&limit=" + limit);
		HttpResponse httpResponse = HttpClientBuilder.create().build().execute(httpRequest);

		assertThat(httpResponse.getStatusLine().getStatusCode(), org.hamcrest.CoreMatchers.equalTo(HttpStatus.SC_OK));
	}

	/**
	 * The method for checking response time of API call
	 * 
	 */
	@Test
	public void checkResponseTime() {

		String term = "jack+johnson";
		Integer limit = 5;

		RestAssured.baseURI = "https://itunes.apple.com/";
		
		given().
		  param("term", term).
		  param("limit", limit).
		when().
		  get("search").
		then().
		  body("results.artistId[0]", equalTo(909253) ).
		  and().time(lessThan(60000L));

	}
}
