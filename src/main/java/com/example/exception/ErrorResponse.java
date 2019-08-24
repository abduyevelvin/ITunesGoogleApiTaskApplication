package com.example.exception;

/**
 * Java class handling error response during exceptions
 * Showing error messages, status and time to the end user
 * Generated setter and getter methods of class fields
 * 
 * @author Abduyev Elvin
 * 
 */
public class ErrorResponse {

	private int status;
	private String message;
	private long timeStamp;
	
	public ErrorResponse() {}

	public ErrorResponse(int status, String message, long timeStamp) {
		this.status = status;
		this.message = message;
		this.timeStamp = timeStamp;
	}

	public int getStatus() {
		return status;
	}

	public void setStatus(int status) {
		this.status = status;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public long getTimeStamp() {
		return timeStamp;
	}

	public void setTimeStamp(long timeStamp) {
		this.timeStamp = timeStamp;
	}
	
}
