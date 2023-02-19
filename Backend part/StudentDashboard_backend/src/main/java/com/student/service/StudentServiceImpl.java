package com.student.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.student.exception.StudentException;
import com.student.model.Student;
import com.student.repo.StudentRepository;

@Service
public class StudentServiceImpl implements StudentService{

	@Autowired
	StudentRepository repo;
	
	@Override
	public Student registerStudent(Student st) throws StudentException {

        Optional<Student> existingStudent=repo.findById(st.getRoll());
        if(!existingStudent.isEmpty())
        {
        	throw new StudentException("Student already exist !");
        }
        repo.save(st);
        
        return  st;
        
		
	}

}
