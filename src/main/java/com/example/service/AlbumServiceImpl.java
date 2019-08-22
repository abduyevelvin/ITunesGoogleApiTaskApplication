package com.example.service;

import java.io.IOException;
import java.util.List;

import org.apache.http.client.ClientProtocolException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.dao.AlbumDao;
import com.example.response.AlbumResponse;

/**
 * Java class implements AlbumService interface
 * Service layer
 * 
 * @author Abduyev Elvin
 * 
 */
@Service
public class AlbumServiceImpl implements AlbumService {
	
	@Autowired
	private AlbumDao albumDao;
	
	/**
	 * AlbumDao injected and used getAlbums method for getting albums.
	 * 
	 * @param term A string containing the search conditions.
	 * @param limit An Integer containing the limit of getting albums can be null.
	*/
	public List<AlbumResponse> getAlbums(String term, Integer limit) throws ClientProtocolException, IOException {
		
		return albumDao.getAlbums(term, limit);
	}

}
