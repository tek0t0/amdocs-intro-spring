package com.amdocs.springmvcex.repository;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.amdocs.springmvcex.model.Employee;
import com.amdocs.springmvcex.utils.DBUtils;

// is going to handle the DB related work
@Repository
public class EmployeeRepositoryImpl implements EmployeeRepository {

	@Autowired
	DBUtils dbUtils;
	
	public String addEmployee(Employee employee) {
		
		Connection connection = dbUtils.getConnection();
		
		try {
			connection.setAutoCommit(false);
		} catch (SQLException e1) {

			e1.printStackTrace();
		}
		PreparedStatement preparedStatement = null;
		
		
		
		try {
			 preparedStatement = connection.prepareStatement("insert into employee (empid, firstname, lastname) values(?,?,?)");
			 preparedStatement.setString(1, employee.getEmpId());
			 preparedStatement.setString(2, employee.getFirstName());
			 preparedStatement.setString(3, employee.getLastName());
			 preparedStatement.executeUpdate();
			 connection.commit();
		} catch (SQLException e) {

			e.printStackTrace();
		}
		
		return null;
	}

	public String updateEmployee(String empId, Employee employee) {
		// TODO Auto-generated method stub
		return null;
	}

	public Employee getEmployeeById(String id) {
		// TODO Auto-generated method stub
		return null;
	}

	public List<Employee> getEmployees() {
		// TODO Auto-generated method stub
		return null;
	}

}
