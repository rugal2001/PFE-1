package com.PFE.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.PFE.demo.model.Employee;
import com.PFE.demo.repository.EmployeeRepository;
@Service

public class EmployeeServiceImpl implements EmployeeService{
    @Autowired
    private EmployeeRepository employeeRepository;
	@Override
	public List<Employee> getAllEmployees() {
		
		return employeeRepository.findAll();
	}
	@Override
	public void saveEmployee(Employee employee ) {
		this.employeeRepository.save(employee);
		
	}
	@Override
	public Employee getEmployeeById(long id) {
		Optional<Employee> optional =employeeRepository.findById(id);
		Employee employee=null;
		if(optional.isPresent()) {
			employee=optional.get();
		}else {
			throw new RuntimeException("Employee avec id : "+id+" n'existe pas!!");
		}
		return employee;
	}
	@Override
	public void deleteEmployerById(long id) {
		this.employeeRepository.deleteById(id);
		
	}
	@Override
	public Employee showEmployeeById(long id) {
		Optional<Employee> optional =employeeRepository.findById(id);
		Employee employee=null;
		if(optional.isPresent()) {
			employee=optional.get();
		}else {
			throw new RuntimeException("Employee avec id : "+id+" n'existe pas!!");
		}
		return employee;
		
	}

}
