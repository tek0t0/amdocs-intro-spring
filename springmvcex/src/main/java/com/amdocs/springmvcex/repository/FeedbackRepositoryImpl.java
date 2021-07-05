package com.amdocs.springmvcex.repository;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.amdocs.springmvcex.model.Feedback;
import com.amdocs.springmvcex.utils.DBUtils;

@Repository
public class FeedbackRepositoryImpl implements FeedbackRepository {

	@Autowired
	DBUtils dbUtils;
	@Override
	public String addFeedback(Feedback feedback) {
		
		Connection connection = dbUtils.getConnection();
		try {
			connection.setAutoCommit(false);
		} catch (SQLException e1) {
			
			e1.printStackTrace();
		}
		
		PreparedStatement preparedStatement = null;
		try {
			 preparedStatement = connection.prepareStatement("insert into feedbacks (name, email, feedback, user_id) values(?,?,?,?)");
			 preparedStatement.setString(1, feedback.getName());
			 preparedStatement.setString(2, feedback.getEmail());
			 preparedStatement.setString(3, feedback.getFeedback());
			 preparedStatement.setInt(4, (int) feedback.getUser_id());
			 preparedStatement.executeUpdate();
			 connection.commit();
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		
		return null;		
	}

}
