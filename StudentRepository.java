package com.example.demo.repository;

import org.springframework.data.repository.CrudRepository;

import com.example.demo.entity.Student1;

public interface StudentRepository  extends CrudRepository<Student1,Long> {
	
}
