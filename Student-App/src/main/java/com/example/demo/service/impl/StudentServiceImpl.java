package com.example.demo.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Student;
import com.example.demo.repo.StudentRepo;
import com.example.demo.service.StudentService;

@Service
public class StudentServiceImpl implements StudentService {
	
	@Autowired
	private StudentRepo repo;

	@Override
	public Integer saveStudent(Student st) {
		
		return repo.save(st).getSid();
	}

	@Override
	public void deleteStudent(Integer sid) {
		repo.deleteById(sid);

	}

	/*@Override
	public Student getOneStudent(Integer sid) {
		
		return repo.getById(sid);
	}
*/
	@Override
	public List<Student> getAllStudents() {
		// TODO Auto-generated method stub
		return repo.findAll();
	}

	@Override
	public void updateStudent(Student st) {
		repo.save(st);
	}

	@Override
	public Optional<Student> getOneStudent(Integer sid) {
		
		return repo.findById(sid);
		}

}
