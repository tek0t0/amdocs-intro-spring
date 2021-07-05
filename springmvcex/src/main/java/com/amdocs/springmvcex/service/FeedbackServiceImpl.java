package com.amdocs.springmvcex.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.amdocs.springmvcex.model.Feedback;
import com.amdocs.springmvcex.repository.FeedbackRepository;

@Service

public class FeedbackServiceImpl implements FeedbackService {

	@Autowired
	FeedbackRepository feedbackRepository;
	@Override
	public String addFeedback(Feedback feedback) {
		return feedbackRepository.addFeedback(feedback);
	}
}
