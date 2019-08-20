package com.example.dao;

import java.io.IOException;
import java.util.List;

import org.apache.http.client.ClientProtocolException;

import com.example.response.AlbumResponse;

public interface AlbumDao {

	List<AlbumResponse> getAlbums(String term, Integer limit) throws ClientProtocolException, IOException;
}
