package ys.pdev.learning.service;

import ys.pdev.learning.model.Course;

public interface CourseService {
	
	boolean updateCourse(Course course);
	
	boolean deleteCourse(int courseId);
	
	Course addCourse(Course course);
}
