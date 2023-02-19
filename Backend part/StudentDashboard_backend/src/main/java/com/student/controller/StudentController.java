package com.student.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.student.exception.StudentException;
import com.student.model.Student;
import com.student.service.StudentService;

@RestController
public class StudentController {

	@Autowired
	StudentService st;
	
	@PostMapping("/registerStudent")
	public ResponseEntity<Student> registerStudent(@RequestBody Student stu) throws StudentException
	{
		Student registered=st.registerStudent(stu);
		return new ResponseEntity<>(registered,HttpStatus.CREATED);
	}
}
