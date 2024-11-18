package com.anoop.spring.employee.api.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.anoop.spring.employee.api.entity.Employee;
import com.anoop.spring.employee.api.service.EmployeeService;

@RestController
public class EmployeeController {

	@Autowired
	private EmployeeService empService;

	@PostMapping("/createEmp")
	public Employee createEmployee(@RequestBody Employee employee) {
		return empService.saveEmployee(employee);
	}

	@GetMapping("/allEmp")
	public List<Employee> getAllEmployees() {
		return empService.getAllemployees();
	}

	@GetMapping("/{id}")
	public Employee getEmployeeById(@PathVariable int id) {
		return empService.getEmployeeById(id);
	}

	@PutMapping("/updateEmp/{id}")
	public Employee updateEmployee(@PathVariable int id, @RequestBody Employee employee) {
		return empService.updateEmployee(id, employee);
	}

	@DeleteMapping("/{id}")
	public String deleteEmployee(@PathVariable int id) {
		return empService.deleteEmployee(id);
	}
}
