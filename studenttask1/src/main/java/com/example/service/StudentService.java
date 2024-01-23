package com.example.service;

import java.util.List;

import com.example.entity.Student;

public interface StudentService {

	 public List<Student> getStudents();
	
	 public Student createStudent(Student student);
	 
	 public void deleteStudentById(int id );
	 
	 public Student updateStudent(Student student);
	 
	 
	
	
	
}
