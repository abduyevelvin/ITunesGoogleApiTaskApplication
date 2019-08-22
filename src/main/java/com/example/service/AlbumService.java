package com.example.service;

import java.io.IOException;
import java.util.List;

import org.apache.http.client.ClientProtocolException;

import com.example.response.AlbumResponse;

/**
 * Java interface for getAlbums method
 * Service layer
 * 
 * @author Abduyev Elvin
 * 
 */
public interface AlbumService {

	/** The method declaration for getAlbums.
	 * @param term A string containing the search conditions.
	 * @param limit An Integer containing the limit of getting albums can be null.
	*/
	List<AlbumResponse> getAlbums(String term, Integer limit) throws ClientProtocolException, IOException;
}
