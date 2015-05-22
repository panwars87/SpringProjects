package ys.pdev.learning.service;

import java.util.List;

import ys.pdev.learning.model.Course;

public interface CourseService {
	
	boolean updateCourse(Course course);
	
	boolean deleteCourse(int courseId);
	
	Course addCourse(Course course);
	
	List<Course> getCourses();
}
