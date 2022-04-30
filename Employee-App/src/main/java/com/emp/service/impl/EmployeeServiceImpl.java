package com.emp.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.emp.model.Employee;
import com.emp.repo.EmployeeRepo;
import com.emp.service.EmployeeService;

@Service
public class EmployeeServiceImpl implements EmployeeService {
	
	@Autowired
	private EmployeeRepo repo;
	

	@Override
	public Integer saveEmployee(Employee emp) {
	
		return repo.save(emp).getEid();
	}


	@Override
	public List<Employee> getAllEmployees() {
	
		return repo.findAll();
	}


	@Override
	public void deleteEmployee(Integer eid) {
		repo.deleteById(eid);
		
	}


	@Override
	public Optional<Employee> getOneEmployee(Integer eid) {
	
		return repo.findById(eid);
	}


	@Override
	public void updateEmployee(Employee emp) {
		repo.save(emp);
		
	}



}
