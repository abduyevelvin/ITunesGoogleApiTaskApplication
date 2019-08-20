package com.example.service;

import java.io.IOException;
import java.util.List;

import org.apache.http.client.ClientProtocolException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.dao.AlbumDao;
import com.example.response.AlbumResponse;

@Service
public class AlbumServiceImpl implements AlbumService {
	
	@Autowired
	private AlbumDao albumDao;
	
	public List<AlbumResponse> getAlbums(String term, Integer limit) throws ClientProtocolException, IOException {
		
		return albumDao.getAlbums(term, limit);
	}

}
