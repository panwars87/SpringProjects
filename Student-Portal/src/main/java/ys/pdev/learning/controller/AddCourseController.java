package ys.pdev.learning.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import ys.pdev.learning.model.Course;
import ys.pdev.learning.model.JSONResponseModel;
import ys.pdev.learning.service.CourseService;
import ys.pdev.learning.util.ResponseStatusEnum;

@RestController
@RequestMapping("/add")
public class AddCourseController {

	private static final Logger _log = LoggerFactory.getLogger(AddCourseController.class);

	@Autowired
	private CourseService courseService;
	
    @RequestMapping("/addCourse")
    public JSONResponseModel<String> addUser(@RequestBody Course course) {
		_log.info("REST called, adding course details");
		JSONResponseModel<String> response = new JSONResponseModel<String>();
		
		courseService.addCourse(course);
		
		response.setData("Successfully addded course :"+ course);
		response.setStatus(ResponseStatusEnum.SUCCESS.getStatus());
		return response;
    }
	
}
