package com.PFE.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.PFE.demo.model.Employee;
import com.PFE.demo.service.EmployeeService;

@Controller
public class EmployeeController {
	//display list of Employee
	@Autowired
	private EmployeeService employeeService;
	
	@GetMapping("/")
     public String ViewHomePage(Model model) {
    	 model.addAttribute("listEmployees", employeeService.getAllEmployees());
    	 System.out.println("Nombre des lignes :"+employeeService.getAllEmployees().size());
    	 return "index";
     }
	@GetMapping("/showNewEmployeeForm")
	public String showNewEmployeeForm(Model model) {
		Employee employee =new Employee();
		model.addAttribute("employee", employee);
		return "new_employee";
	}
	@PostMapping("/saveEmployee")
	public String saveEmployee(@ModelAttribute("employee") Employee employee) {
		employeeService.saveEmployee(employee);
		return "employee_info";
	}
	
	@GetMapping("/showFormForUpdate/{id}")
	public String showFormForUpdate(@PathVariable (value="id") long id,Model model) {
		Employee employee = employeeService.getEmployeeById(id);
		model.addAttribute("employee", employee);
		return "Update_Employee";
	}
	@GetMapping("/deleteEmployee/{id}")
	public String deleteEmployee(@PathVariable (value ="id" ) long id) {
		this.employeeService.deleteEmployerById(id);
		return "redirect:/";
	}
	@GetMapping("/showInformations/{id}")
	public String showInformations(@PathVariable (value="id") long id,Model model) {
		Employee employee = employeeService.getEmployeeById(id);
		model.addAttribute("employee", employee);
		return "employee_info";
	
	}
}
