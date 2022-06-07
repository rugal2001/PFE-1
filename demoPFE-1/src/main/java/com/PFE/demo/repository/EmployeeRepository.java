package com.PFE.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.PFE.demo.model.Employee;
@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long>{

}
