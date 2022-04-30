package com.emp.service;

import java.util.List;
import java.util.Optional;

import com.emp.model.Employee;

public interface EmployeeService {
	
	public Integer saveEmployee(Employee emp);
	public List<Employee> getAllEmployees();
	public void deleteEmployee (Integer eid);
	public Optional<Employee> getOneEmployee(Integer eid);
	public void updateEmployee(Employee emp);
	

}
