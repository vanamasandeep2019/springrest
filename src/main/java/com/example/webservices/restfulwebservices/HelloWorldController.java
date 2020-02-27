package com.example.webservices.restfulwebservices;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {
	
	@RequestMapping(method=RequestMethod.GET,path="/helloworld")
	public String helloWorld(){
		return "Hello World";
	}
	
	@GetMapping(path="/hellojava")
	public String helloJava(){
		return "Hello Java";
	}

}
