package com.example.service;

import java.io.IOException;
import java.util.List;

import org.apache.http.client.ClientProtocolException;

import com.example.response.AlbumResponse;

public interface AlbumService {

	List<AlbumResponse> getAlbums(String term, Integer limit) throws ClientProtocolException, IOException;
}
