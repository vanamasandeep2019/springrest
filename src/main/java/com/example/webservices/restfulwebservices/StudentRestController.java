package com.example.webservices.restfulwebservices;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class StudentRestController {
	
	@GetMapping("/students")
	public List<Student> getStudents(){
		Student student= new Student("Sandeep","Krishna");
		Student student1= new Student("Arun","Sharma");
		List<Student> list=new ArrayList<>();
		list.add(student1);
		list.add(student);
		return list;
		
	}
	

}
