package com.amdocs.springmvcex.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.amdocs.springmvcex.model.Course;
import com.amdocs.springmvcex.service.CourseService;

@Controller
public class CourseController {
	
	@Autowired
	CourseService courseService;
	
	@RequestMapping(path="/addCourse", method=RequestMethod.GET)
	public String addCourse() {
		return "addCourse";
	}
	
	@RequestMapping(path="/addCourse", method=RequestMethod.POST)
	public String addCourse(@ModelAttribute Course course) {
		courseService.addCourse(course);
		return "home";
	}
}
