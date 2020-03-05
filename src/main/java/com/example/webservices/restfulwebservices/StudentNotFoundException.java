package com.example.webservices.restfulwebservices;

public class StudentNotFoundException extends RuntimeException{
	
	public StudentNotFoundException(String message){
		super(message);
	}

}
