package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Student1;
import com.example.demo.repository.StudentRepository;

@Service
public class StudentService {
	@Autowired
    private StudentRepository repo;
public Iterable<Student1> listAll() {
        return this.repo.findAll();
    }
//saving a specific record by using the method save() of CrudRepository  
public void saveOrUpdate(Student1 students)  
{  
repo.save(students);  
}
public Student1 getStudentById(long id)  
{  
return repo.findById(id).get();  
}
public void update(Student1 students, int id)  
{  
repo.save(students);  
}  
 
public void delete(long id)  
{  
repo.deleteById(id);  
}  
}
