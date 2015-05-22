package ys.pdev.learning.service.impl;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ys.pdev.learning.model.Course;
import ys.pdev.learning.repository.CourseRepository;
import ys.pdev.learning.service.CourseService;

@Service("courseService")
public class CourseServiceImpl implements CourseService{

private static final Logger _log = LoggerFactory.getLogger(CourseService.class);
	
	@Autowired
	private CourseRepository courseRepository;
	
	public boolean updateCourse(Course course){
		_log.info("Inside update Course service impl");
		return courseRepository.updateCourse(course);
	}
	
	public boolean deleteCourse(int courseId){
		_log.info("Inside delete Course service impl");
		return courseRepository.deleteCourse(courseId);
	}

	@Override
	public Course addCourse(Course course) {
		// TODO Auto-generated method stub
		_log.info("Inside adding Course service impl");
		return course;
	}

	@Override
	public List<Course> getCourses() {
		// TODO Auto-generated method stub
		_log.info("Inside pulling all courses methods");
		
		return courseRepository.getCourses();
	}
}
