package com.amdocs.springmvcex.repository;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.amdocs.springmvcex.model.Course;
import com.amdocs.springmvcex.utils.DBUtils;

@Repository
public class CourseRepositoryImpl implements CourseRepository {

	@Autowired
	DBUtils dbUtils;
	@Override
	public String addCourse(Course course) {
		Connection connection = dbUtils.getConnection();
		try {
			connection.setAutoCommit(false);
		} catch (SQLException e1) {
			
			e1.printStackTrace();
		}
		
		PreparedStatement preparedStatement = null;
		try {
			 preparedStatement = connection.prepareStatement("insert into courses (name, description, fees, resource) values(?,?,?,?)");			 
			 preparedStatement.setString(1, course.getName());
			 preparedStatement.setString(2, course.getDescription());
			 preparedStatement.setString(3, course.getFees());
			 preparedStatement.setString(4, course.getResource());
			 preparedStatement.executeUpdate();
			 connection.commit();
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		
		return null;
	}

}
