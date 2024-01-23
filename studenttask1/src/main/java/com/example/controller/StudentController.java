package com.example.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.entity.Student;
import com.example.service.StudentService;


@RestController
public class StudentController {
	@Autowired
	StudentService studentService;
	
	
	@PostMapping("/addstudent")
	public Student addStudent(@RequestBody Student student ) {
		return studentService.createStudent(student);
		
	
	}
	
	@GetMapping("/getStudents")
	public List<Student> getAllStudent(){
		
		return studentService.getStudents();
		
	}
	@PutMapping("/updateStudent")
	public Student updateStudent( @RequestBody Student student) {
		
		return studentService.updateStudent(student);
	}
	@DeleteMapping("/deleteStudent/{id}")
	public void deleteStudent(@PathVariable int id) {
		
		studentService.deleteStudentById(id);
	}

}
