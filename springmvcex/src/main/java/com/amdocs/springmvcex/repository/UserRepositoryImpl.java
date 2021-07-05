package com.amdocs.springmvcex.repository;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.amdocs.springmvcex.model.User;
import com.amdocs.springmvcex.utils.DBUtils;

@Repository
public class UserRepositoryImpl implements UserRepository {

	@Autowired
	DBUtils dbUtils;	
	@Override
	public String addUser(User user) {
		Connection connection = dbUtils.getConnection();
		try {
			connection.setAutoCommit(false);
		} catch (SQLException e1) {
			
			e1.printStackTrace();
		}
		
		PreparedStatement preparedStatement = null;
		try {
			 preparedStatement = connection.prepareStatement("insert into users (user_Id, name, email, password, phone_number, address, upload_photo) values(?,?,?,?,?,?,?)");
			 preparedStatement.setInt(1, (int) user.getUser_Id());
			 preparedStatement.setString(2, user.getName());
			 preparedStatement.setString(3, user.getEmail());
			 preparedStatement.setString(4, user.getPassword());
			 preparedStatement.setString(5, user.getPhone_number());
			 preparedStatement.setString(6, user.getAddress());
			 preparedStatement.setString(7, user.getUpload_photo());
			 preparedStatement.executeUpdate();
			 connection.commit();
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		
		return null;
		
	}

}
