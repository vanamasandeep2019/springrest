package com.example.webservices.restfulwebservices;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
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
	
	@GetMapping(path="/hello-world-bean")
	public HelloWorldBean getHelloWordBean(){
		return new HelloWorldBean("Hello World Bean");
		
	}
	
	@GetMapping(path="/hello-world-bean/path-variable/{name}")
	public HelloWorldBean getHelloWordPathVariable(@PathVariable String name){
		return new HelloWorldBean(name);
		
	}

}
