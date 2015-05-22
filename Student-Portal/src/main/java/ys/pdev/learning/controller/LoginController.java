package ys.pdev.learning.controller;

import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import ys.pdev.learning.model.Course;
import ys.pdev.learning.model.JSONResponseModel;
import ys.pdev.learning.model.Student;
import ys.pdev.learning.service.CourseService;
import ys.pdev.learning.service.StudentService;
import ys.pdev.learning.util.ResponseStatusEnum;

/**
 * Handles requests for the application home page.
 */

@RestController
@RequestMapping("/login")
public class LoginController {
	
	private static final Logger _log = LoggerFactory.getLogger(LoginController.class);

	@Autowired
	private StudentService studentService;
	
	@Autowired
	private CourseService courseService;
	
    @RequestMapping(value="/authenticateUser")
    public JSONResponseModel<String> authenticateUser(@RequestBody Student student) {
		_log.info("REST called, getting user auth details");
		_log.info("Student is : " + student);
		
		JSONResponseModel<String> response = new JSONResponseModel<String>();
		//Student student = new Student();
		if(studentService.authenticateUser(student)){
			response.setStatus(ResponseStatusEnum.SUCCESS.getStatus());
		}else{
			response.setStatus(ResponseStatusEnum.FAILED.getStatus());
		}
		
		response.setData("Successfully got userName :"+student.getFirstName());
		return response;
    }
    
    @RequestMapping(value="/fetchCourses" , method = RequestMethod.GET)
    public JSONResponseModel<List<Course>> fetchCourses() {
		_log.info("REST called, getting courses details");
		
		JSONResponseModel<List<Course>> response = new JSONResponseModel<List<Course>>();
		List<Course> courseList = courseService.getCourses();
		
		if(courseList != null && courseList.size() > 0){
			response.setData(courseList);
			response.setStatus("true");
		}else{
			response.setStatus("false");
		}
				
		return response;
    }
	
}