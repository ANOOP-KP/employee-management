package com.anoop.spring.employee.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.anoop.spring.employee.api.entity.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Integer>{

}
