package com.PFE.demo.service;

import java.util.List;

import com.PFE.demo.model.Employee;

public interface EmployeeService {
	List<Employee> getAllEmployees();
	void saveEmployee(Employee employee);
	Employee getEmployeeById(long id); 
	void deleteEmployerById(long id);
	Employee showEmployeeById(long id);

}
