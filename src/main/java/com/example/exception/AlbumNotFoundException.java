package com.example.exception;

public class AlbumNotFoundException extends RuntimeException {

	private static final long serialVersionUID = 1L;
	
	public AlbumNotFoundException(String message, Throwable cause) {
		super(message, cause);
	}
	
	public AlbumNotFoundException(String message) {
		super(message);
	}
	
	public AlbumNotFoundException(Throwable cause) {
		super(cause);
	}
}
