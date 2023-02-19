package com.student.service;

import com.student.exception.StudentException;
import com.student.model.Student;

public interface StudentService {

	public Student registerStudent(Student st) throws StudentException;
}
