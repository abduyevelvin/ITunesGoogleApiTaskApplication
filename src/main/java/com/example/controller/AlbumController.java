package com.example.controller;

import java.io.IOException;
import java.util.List;

import org.apache.http.client.ClientProtocolException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.response.AlbumResponse;
import com.example.service.AlbumService;

@RestController
@RequestMapping("/api")
public class AlbumController {

	@Autowired
	private AlbumService albumService;
	
	@GetMapping("/albums")
	public ResponseEntity<List<AlbumResponse>> getAlbums(@RequestParam String term, @RequestParam(required = false) Integer limit) 
			throws ClientProtocolException, IOException {
		
		term = term.replaceAll(" ", "+");
		
		List<AlbumResponse> albResp = albumService.getAlbums(term, limit);
		
		return ResponseEntity.ok().body(albResp);
	}
}
