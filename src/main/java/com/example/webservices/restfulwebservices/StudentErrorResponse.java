package com.example.webservices.restfulwebservices;

public class StudentErrorResponse {
	
	private int status;
	
	private String message;
	
	private long timeStamp;
	
    public int getStatus() {
		return status;
	}
    
    public void setStatus(int status) {
		this.status = status;
	}
    
    public void setMessage(String message) {
		this.message = message;
	}
    
    public void setTimeStamp(long timeStamp) {
		this.timeStamp = timeStamp;
	}
	
	

}
