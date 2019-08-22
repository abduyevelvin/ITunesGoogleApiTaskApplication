package com.example.dao;

import java.io.IOException;
import java.util.List;

import org.apache.http.client.ClientProtocolException;

import com.example.response.AlbumResponse;

/**
 * Java interface for getAlbums method
 * 
 * @author Abduyev Elvin
 * 
 */
public interface AlbumDao {

	/** The method declaration for getAlbums.
	 * Throwing exceptions.
	 * 
	 * @param term A string containing the search conditions.
	 * @param limit An Integer containing the limit of getting albums can be null.
	*/
	List<AlbumResponse> getAlbums(String term, Integer limit) throws ClientProtocolException, IOException;
}
