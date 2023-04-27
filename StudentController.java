package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Student1;
import com.example.demo.service.StudentService;

@RestController
public class StudentController {
	@Autowired
	private StudentService services;
	@GetMapping("/getall")
	public Iterable<Student1>getStudents()
	{
	return services.listAll();    
	}
	 
	@PostMapping(value = "/save")
	private long saveBook(@RequestBody Student1 students)  
	{  
	services.saveOrUpdate(students);  
	return  students.getId();  
	}
	 
	  
	@RequestMapping("/student1/{id}")  
	private Student1 getBooks(@PathVariable(name = "id") int studentid)  
	{  
	return services.getStudentById(studentid);  
	}  
	    
	@PutMapping("/edit/{id}")
	 
	    private Student1 update(@RequestBody Student1 students)  
	    {  
	   services.saveOrUpdate(students);  
	       return students;  
	    }  
	@DeleteMapping("/delete/{id}")  
	private void deleteStudent(@PathVariable("id") int id)  
	{  
	services.delete(id);  
	}  
	
}
