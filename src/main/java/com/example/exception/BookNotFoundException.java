package com.example.exception;

/**
 * Java class type of unchecked exception which is extending RuntimeException
 * Containing three constructors which calls super class constructors
 * 
 * @author Abduyev Elvin
 * 
 */
public class BookNotFoundException extends RuntimeException {

	private static final long serialVersionUID = 1L;
	
	public BookNotFoundException(String message, Throwable cause) {
		super(message, cause);
	}
	
	public BookNotFoundException(String message) {
		super(message);
	}
	
	public BookNotFoundException(Throwable cause) {
		super(cause);
	}
}
