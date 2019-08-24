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

import com.example.exception.AlbumNotFoundException;
import com.example.response.AlbumResponse;
import com.example.service.AlbumService;

/**
 * Java class for creating RESTful web services
 * Injecting AlbumService for using required methods for getting result
 * 
 * @author Abduyev Elvin
 * 
 */
@RestController
@RequestMapping("/api")
public class AlbumController {

	@Autowired
	private AlbumService albumService;
	
	/**
	 * The method for getting albums from ITunes
	 * 
	 * @param term mandatory search condition
	 * @param limit not required search condition and default is 5
	 * @return list of albums or throws exceptions
	 * 
	 * @throws ClientProtocolException
	 * @throws IOException
	 * @throws AlbumNotFoundException
	 */
	@GetMapping("/albums")
	public ResponseEntity<List<AlbumResponse>> getAlbums(@RequestParam String term, @RequestParam(required = false) Integer limit) 
			throws ClientProtocolException, IOException {
		
		term = term.replaceAll(" ", "+");
		
		List<AlbumResponse> albResp = albumService.getAlbums(term, limit);
		
		if(albResp.isEmpty() || albResp == null) {
			throw new AlbumNotFoundException("There is no album in given search conditions: " + term);
		}
		
		return ResponseEntity.ok().body(albResp);
	}
}
