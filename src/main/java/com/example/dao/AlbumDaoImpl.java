package com.example.dao;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.SocketTimeoutException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.apache.http.client.ClientProtocolException;
//import org.apache.http.client.fluent.Request;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.example.entity.Album;
import com.example.entity.ITunesAlbums;
import com.example.response.AlbumResponse;
import com.fasterxml.jackson.databind.ObjectMapper;

/**
 * Java class implements AlbumDao interface
 * 
 * @author Abduyev Elvin
 * 
 */
@Repository
public class AlbumDaoImpl implements AlbumDao {

	private final Logger logger = LoggerFactory.getLogger(AlbumDaoImpl.class);

	@Autowired
	private ObjectMapper mapper;

	/**
	 * The method getting albums. Connecting to the API and getting albums under
	 * searching conditions For logging used Logger ObjectMapper injected and used
	 * for converting JSON format to Java class
	 * 
	 * @param term  A string containing the search conditions.
	 * @param limit An Integer containing the limit of getting albums can be null.
	 */
	@Override
	public List<AlbumResponse> getAlbums(String term, Integer limit) throws ClientProtocolException, IOException {

		ITunesAlbums albums = null;
		List<Album> alb = new ArrayList<Album>();
		List<AlbumResponse> albResp = new ArrayList<AlbumResponse>();
		AlbumResponse resp = new AlbumResponse();
		StringBuilder sb = new StringBuilder();
		String output;

		if (limit == null || limit == 0) {
			limit = 5;
		}

		// Request request = Request.Get("https://itunes.apple.com/search?term=" + term
		// + "&limit=" + limit);
		// String response = request.execute().returnContent().asString();

		URL url = new URL("https://itunes.apple.com/search?term=" + term + "&limit=" + limit);
		HttpURLConnection req = (HttpURLConnection) url.openConnection();
		req.connect();

		try {
			BufferedReader br = new BufferedReader(new InputStreamReader((req.getInputStream())));
			while ((output = br.readLine()) != null) {
				sb.append(output);
			}

			req.setConnectTimeout((int) TimeUnit.SECONDS.toMinutes(60L));
			req.setReadTimeout((int) TimeUnit.SECONDS.toMinutes(60L));
		} catch (SocketTimeoutException e) {
			logger.error("Response time is longer");
		}

		String response = sb.toString();

		albums = mapper.readValue(response, ITunesAlbums.class);

		alb = albums.getResults();

		for (Album al : alb) {
			resp.setTitle(al.getTrackName());
			resp.setArtist(al.getArtistName());
			resp.setKind(al.getKind());

			albResp.add(resp);
		}

		if (response == null) {
			logger.error("There is no album within entered searching conditions!");
		} else {
			logger.info(albResp.toString());
		}

		return albResp;
	}

}
