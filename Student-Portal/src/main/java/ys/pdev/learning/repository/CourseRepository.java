package ys.pdev.learning.repository;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Repository;

import ys.pdev.learning.model.Course;

@Repository("courseRepository")
public class CourseRepository {
	private static final Logger _log = LoggerFactory.getLogger(CourseRepository.class);
	
	public boolean deleteCourse(int courseId){
		_log.info("Inside delete course repo");
		return false;
	}
	
	public boolean updateCourse(Course course){
		_log.info("Inside update course repo");
		return false;
	}
	
	public Course addCourse(Course course){
		_log.info("Inside update course repo");
		return course;
	}
}
