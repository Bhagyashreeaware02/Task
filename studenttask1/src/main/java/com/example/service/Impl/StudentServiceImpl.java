package com.example.service.Impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.entity.Student;
import com.example.repository.StudentRepository;
import com.example.service.StudentService;

@Service
public class StudentServiceImpl implements StudentService {
 @Autowired
 StudentRepository studentRepository;
 
	@Override
	public List<Student> getStudents() {
		// TODO Auto-generated method stub
		
		 return studentRepository.findAll() ;
	}

	@Override
	public Student createStudent(Student student) {
		// TODO Auto-generated method stub
		
		return studentRepository.save(student);
	}

	@Override
	public void deleteStudentById(int id) {
		// TODO Auto-generated method stub
		
	 studentRepository.deleteById(id);
	}

	@Override
	public Student updateStudent(Student student) {
	
		// TODO Auto-generated method stub
		Student existingstudent =studentRepository.findById(student.getId()).get();
		
        // Update the fields of the existing user with the values from the updated user

		           ///  recive                    give
	//	junastudent recive ( navenstudent ni dilela naav )

	    existingstudent.setStdname(student.getStdname());
		existingstudent.setMarks(student.getMarks());
		existingstudent.setContact(student.getContact());
		existingstudent.setRollno(student.getRollno());
		existingstudent.setStdaddres(student.getStdaddres());
		
		return studentRepository.save(existingstudent) ;
				
				
				
				
		
	//	set is a predefine method of objects to set the value in the objet where as get is the method used for to get the data from objetcs
		// kisi bhi object ko agar values accept krni hai toh wo set method use krega aur agar kisi bhi objet ko values deni hai to wo get karega
		
		
		

	
		
		
		
	
	}

}
