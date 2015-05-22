package ys.pdev.learning.repository;

import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import ys.pdev.learning.model.Course;

@Repository("courseRepository")
public class CourseRepository {
	private static final Logger _log = LoggerFactory.getLogger(CourseRepository.class);
	private static final String deleteCourse = "delete from course where courseId=?";
	private static final String fetchCourse = "select * from course";
	private static final String updateCourse = "update course set courseName = ?, courseNumber = ? where courseId = ?";
	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	public boolean deleteCourse(int courseId){
		_log.info("Inside delete course repo");
		try{
			int deletedRows = jdbcTemplate.update(deleteCourse, courseId);
			_log.info(deletedRows + " rows deleted");
			return true;
		}catch(Exception e){
			e.printStackTrace();
			return false;
		}
	}
	
	public boolean updateCourse(Course course){
		_log.info("Inside update course repo");
		
		try{
			int updatedRows = jdbcTemplate.update(updateCourse, course.getCourseName(), course.getCourseNumber(), course.getCourseId());
			_log.info(updatedRows + " rows updated");
			return true;
		}catch(Exception e){
			e.printStackTrace();
			return false;
		}
	}
	
	public Course addCourse(Course course){
		_log.info("Inside update course repo");
		return course;
	}
	
	public List<Course> getCourses(){
		_log.info("Inside get course repo");
		List<Course> courseList = new ArrayList<Course>();
		
		courseList = jdbcTemplate.query(fetchCourse, new BeanPropertyRowMapper(Course.class));
		
		return courseList;
	}
}
