package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import com.example.demo.model.Student;

public interface StudentService {
	
	public Integer saveStudent(Student st);
	public void deleteStudent(Integer sid);
//	public Student getOneStudent(Integer sid);
	public List<Student> getAllStudents();
	public void updateStudent(Student st);
	public Optional<Student> getOneStudent(Integer sid);
	

}
