package com.example.demo.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Student;
import com.example.demo.service.StudentService;

@RestController
@RequestMapping("/student")
public class StudentController {
	
	@Autowired
	private StudentService service;
	
	@PostMapping("/save")
	public ResponseEntity<String> saveStudent(@RequestBody Student student){
		Integer sid=service.saveStudent(student);
		String body="Student saved with id:-"+sid;
		return ResponseEntity.ok(body);
	}
	@GetMapping("/all")
	public ResponseEntity<List<Student>> getAllStudents(){
		List<Student> l=service.getAllStudents();
		return ResponseEntity.ok(l);
	}
	@DeleteMapping("/delete/{sid}")
public ResponseEntity<String> deleteStudent(@PathVariable Integer sid){
	service.deleteStudent(sid);
	String body="Student deleted with id:-"+sid;
return ResponseEntity.ok(body);
}

	@PutMapping("/update")
	public ResponseEntity<String> updateStudent(@RequestBody Student student){
		service.updateStudent(student);
		String body="Student Updated:-"+student.getSid();
		return ResponseEntity.ok(body);
	}
	
	@GetMapping("/one/{sid}")
	public ResponseEntity<?> getOneStudent(@PathVariable Integer sid){
		Optional<Student> opt=service.getOneStudent(sid);
		
	return ResponseEntity.ok(opt);
		
	}
}
