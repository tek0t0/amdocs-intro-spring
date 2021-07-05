package com.amdocs.springmvcex.repository;

import java.math.BigDecimal;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.amdocs.springmvcex.model.Contact;
import com.amdocs.springmvcex.utils.DBUtils;

@Repository
public class ContactRepositoryImpl implements ContactRepository {

	@Autowired
	DBUtils dbUtils;
	@Override
	public String addContact(Contact contact) {
		Connection connection = dbUtils.getConnection();
		try {
			connection.setAutoCommit(false);
		} catch (SQLException e1) {
			
			e1.printStackTrace();
		}
		
		PreparedStatement preparedStatement = null;
		try {
			 preparedStatement = connection.prepareStatement("insert into contacts (user_id, name, email, phone_number, message) values(?,?,?,?,?)");
			 preparedStatement.setInt(1, (int) contact.getUser_id());
			 preparedStatement.setString(2, contact.getName());
			 preparedStatement.setString(3, contact.getEmail());
			 preparedStatement.setString(4, contact.getPhone_number());
			 preparedStatement.setString(5, contact.getMessage());
			 preparedStatement.executeUpdate();
			 connection.commit();
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		
		return null;		
	}

}
