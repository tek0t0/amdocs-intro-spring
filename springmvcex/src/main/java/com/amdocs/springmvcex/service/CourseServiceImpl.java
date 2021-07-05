package com.amdocs.springmvcex.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.amdocs.springmvcex.model.Course;
import com.amdocs.springmvcex.repository.CourseRepository;

@Service

public class CourseServiceImpl implements CourseService {

	@Autowired
	CourseRepository courseRepository;
	@Override
	public String addCourse(Course course) {
		return courseRepository.addCourse(course);
	}

}
