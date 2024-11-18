package com.anoop.spring.employee.api.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "EMPL_TBL")

public class Employee {
	@Id
	@GeneratedValue
	private int empid;
	private String empname;
	private String email;
	private String department;
	private double salary;
	private String phone;
}
