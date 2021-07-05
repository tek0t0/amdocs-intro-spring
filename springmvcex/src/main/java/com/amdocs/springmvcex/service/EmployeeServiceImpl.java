package com.amdocs.springmvcex.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.amdocs.springmvcex.model.Employee;
import com.amdocs.springmvcex.repository.EmployeeRepository;

@Service

public class EmployeeServiceImpl implements EmployeeService {

	@Autowired
	EmployeeRepository employeeRepository;
	
	public String addEmployee(Employee employee) {
		return employeeRepository.addEmployee(employee);
	}

	public String updateEmployee(String empId, Employee employee) {
		return null;
	}

	public Employee getEmployeeById(String id) {
		return null;
	}

	public List<Employee> getEmployees() {
		return null;
	}

}
