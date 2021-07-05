package com.amdocs.springmvcex.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.amdocs.springmvcex.model.Feedback;
import com.amdocs.springmvcex.service.FeedbackService;


@Controller
public class FeedbackController {
	
	@Autowired
	FeedbackService feedbackService;
	
	@RequestMapping(path="/addFeedback", method=RequestMethod.GET)
	public String addFeedback() {
		return "addFeedback";
	}
	
	@RequestMapping(path="/addFeedback", method=RequestMethod.POST)
	public String addFeedback(@ModelAttribute Feedback feedback) {
		feedbackService.addFeedback(feedback);
		return "home";
	}
}
