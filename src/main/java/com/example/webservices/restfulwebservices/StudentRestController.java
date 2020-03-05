package com.example.webservices.restfulwebservices;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
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
	public Student getStudent(@PathVariable String studentName){
		
	
		for (Student student : students) {
			if(studentName.equals(student.getFname())){
				return student;
			}else{
				throw new StudentNotFoundException("Student Id Not Found");
			}
		}
		return null;
		
	}

	
/*	@GetMapping("/students/{studentNam}")
	public List<Student>  getStudentDetails(@PathVariable String studentName){
		
		
		List<Student> student = students.stream()
			    .filter(s -> s.getFname() .equalsIgnoreCase(studentName)).collect(Collectors.toList());
		
		return student;
		
	}*/
	
	@ExceptionHandler
	public ResponseEntity<StudentErrorResponse> handleException(StudentNotFoundException exc){
		
		StudentErrorResponse error=new StudentErrorResponse();
		error.setMessage("Student Id not Found");
		error.setStatus(HttpStatus.NOT_FOUND.value());
		error.setTimeStamp(System.currentTimeMillis());
		return new ResponseEntity<>(error,HttpStatus.NOT_FOUND);
		
	}
}
