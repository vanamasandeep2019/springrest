package com.example.webservices.restfulwebservices;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class StudentRestController {
	
	private List<Student> students;
	
	
	private List<Student> getStudents(){
		return students;
	}
	
	public void setStudents(List<Student> students) {
		this.students = students;
	}


	@GetMapping("/students")
	public List<Student> getStudentsList(){
		Student student= new Student("Sandeep","Krishna");
		Student student1= new Student("Arun","Sharma");
		List<Student> list=new ArrayList<>();
		list.add(student1);
		list.add(student);
		this.students=list;
		return list;
		
	}
	
	
	@GetMapping("/students/{studentName}")
	public List<Student>  getStudent(@PathVariable String studentName){
		
		
		List<Student> student = students.stream()
			    .filter(s -> s.getFname() .equalsIgnoreCase("Sandeep")).collect(Collectors.toList());
		
		return student;
		
			
	
		
	}

}
