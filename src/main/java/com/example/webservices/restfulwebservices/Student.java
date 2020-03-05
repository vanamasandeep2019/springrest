package com.example.webservices.restfulwebservices;

public class Student {
	
	private String fname;
	
	private String lname;
	
	public Student(String fname,String lname){
		this.fname=fname;
		this.lname=lname;
	}
	
	public String getFname() {
		return fname;
	}
	
	public String getLname() {
		return lname;
	}
}
