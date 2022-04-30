package com.emp.restcontroller;

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

import com.emp.model.Employee;
import com.emp.service.EmployeeService;

@RestController
@RequestMapping("/emp")
public class EmployeeRestController {
	@Autowired
	private EmployeeService service;
	
	@PostMapping("/save")
	public ResponseEntity<String> saveEmployee(@RequestBody Employee emp){
		Integer eid=service.saveEmployee(emp);
		String msg="Employee save:-"+eid;
		return ResponseEntity.ok(msg);
	}

	@GetMapping("/all")
	public ResponseEntity<List<Employee>> getAllEmployees(){
		List l=service.getAllEmployees();
		return ResponseEntity.ok(l);
	}
	@DeleteMapping("/remove/{eid}")
	public ResponseEntity<String> deleteEmployee(@PathVariable Integer eid){
		service.deleteEmployee(eid);
		String st="Employee deleted";
		return ResponseEntity.ok(st);
	}
	
	@GetMapping("/one/{eid}")
	public ResponseEntity<Optional<?>> getOneEmployee(@PathVariable Integer eid){
		Optional<Employee> opt=service.getOneEmployee(eid);
		return ResponseEntity.ok(opt);
	}
	@PutMapping("/update")
	public ResponseEntity<String> updateEmployee(@RequestBody Employee employee){
		service.saveEmployee(employee);
		String str="Employee updated";
		return ResponseEntity.ok(str);
	}
	
}
