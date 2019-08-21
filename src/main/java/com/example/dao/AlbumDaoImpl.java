package com.example.dao;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.fluent.Request;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.example.entity.Album;
import com.example.entity.ITunesAlbums;
import com.example.response.AlbumResponse;
import com.fasterxml.jackson.databind.ObjectMapper;

@Repository
public class AlbumDaoImpl implements AlbumDao {

	private final Logger logger = LoggerFactory.getLogger(AlbumDaoImpl.class);
	
	@Autowired
	private ObjectMapper mapper;
	
	@Override
	public List<AlbumResponse> getAlbums(String term, Integer limit) throws ClientProtocolException, IOException {
		
		ITunesAlbums albums = null;
		List<Album> alb = new ArrayList<Album>();
		List<AlbumResponse> albResp = new ArrayList<AlbumResponse>();
		AlbumResponse resp = new AlbumResponse();
		
		if(limit == null || limit == 0) {
			limit = 5;
		}
		
		Request request = Request.Get("https://itunes.apple.com/search?term=" + term + "&limit=" + limit);
		String response = request.execute().returnContent().asString();
		
		albums = mapper.readValue(response, ITunesAlbums.class);
		
		alb = albums.getResults();
		
		for(Album al : alb) {
			resp.setTitle(al.getTrackName());
			resp.setArtist(al.getArtistName());
			resp.setKind(al.getKind());
			
			albResp.add(resp);
		}
		
		logger.info(albResp.toString());
		
		return albResp;
	}

}
