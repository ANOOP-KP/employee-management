package com.anoop.spring.employee.api.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.anoop.spring.employee.api.entity.Employee;
import com.anoop.spring.employee.api.repository.EmployeeRepository;

@Service
public class EmployeeService {

	@Autowired
	private EmployeeRepository employeeRepository;

	public List<Employee> getAllemployees() {
		return employeeRepository.findAll();
	}

	public Employee getEmployeeById(int id) {
		return employeeRepository.findById(id).orElse(null);
	}

	public Employee saveEmployee(Employee employee) {
		return employeeRepository.save(employee);
	}

	public Employee updateEmployee(int id, Employee employee) {
		Employee existingEmployee = employeeRepository.findById(id).orElse(null);
		existingEmployee.setEmpname(employee.getEmpname());
		existingEmployee.setEmail(employee.getEmail());
		existingEmployee.setDepartment(employee.getDepartment());
		existingEmployee.setSalary(employee.getSalary());
		existingEmployee.setPhone(employee.getPhone());
		return employeeRepository.save(existingEmployee);
	}

	public String deleteEmployee(int id) {
		employeeRepository.deleteById(id);
		return "Employee Successfully Removed " + id;
	}
}
