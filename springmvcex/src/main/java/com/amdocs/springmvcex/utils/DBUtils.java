package com.amdocs.springmvcex.utils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import org.springframework.stereotype.Component;

@Component
public class DBUtils {

	static final String DBURL="jdbc:mysql://localhost:3306/amdocs";
	static final String userName="root";
	static final String password ="12345";

	
	public Connection getConnection() {
		// 
		Connection connection = null;
		PreparedStatement preparedStatement = null;
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			connection = DriverManager.getConnection(DBURL,userName,password);
//			// to establish the physical connection with DB.
//			preparedStatement = connection.prepareStatement(	);
//			preparedStatement.setString(1, x);3
			return connection;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
		
	}
	
	public void closeConnection(Connection connection) {
		try {
			connection.close();
		} catch (SQLException e) { // checked exception
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
