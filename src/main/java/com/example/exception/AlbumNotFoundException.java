package com.example.exception;

/**
 * Java class type of unchecked exception which is extending RuntimeException
 * Containing three constructors which calls super class constructors
 * 
 * @author Abduyev Elvin
 * 
 */
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
