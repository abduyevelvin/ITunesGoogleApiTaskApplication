package com.example.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

/**
 * Java class handling exceptions during API calls using ControllerAdvice
 * 
 * @author Abduyev Elvin
 * 
 */
@ControllerAdvice
public class BookExceptionController {

	/**
	 * The method for handling exceptions when no books found under given conditions 
	 * 
	 * @param ex A BookNotFoundException containing which kind of exception thrown
	 * @return response of error and http status regarding of exception
	 */
	@ExceptionHandler
	public ResponseEntity<ErrorResponse> handleExcpetion(BookNotFoundException ex) {
		ErrorResponse error = new ErrorResponse();
		error.setStatus(HttpStatus.NOT_FOUND.value());
		error.setMessage(ex.getMessage());
		error.setTimeStamp(System.currentTimeMillis());

		return new ResponseEntity<>(error, HttpStatus.NOT_FOUND);
	}

	/**
	 * The method for handling exceptions for any bad requests 
	 * 
	 * @param ex An Exception containing which kind of exception thrown
	 * @return response of error and http status regarding of exception
	 */
	@ExceptionHandler
	public ResponseEntity<ErrorResponse> handleExcpetion(Exception ex) {
		ErrorResponse error = new ErrorResponse();
		error.setStatus(HttpStatus.BAD_REQUEST.value());
		error.setMessage(ex.getMessage());
		error.setTimeStamp(System.currentTimeMillis());

		return new ResponseEntity<>(error, HttpStatus.BAD_REQUEST);
	}
}
