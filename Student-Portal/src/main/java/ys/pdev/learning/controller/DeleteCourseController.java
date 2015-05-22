package ys.pdev.learning.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import ys.pdev.learning.model.JSONResponseModel;
import ys.pdev.learning.service.CourseService;
import ys.pdev.learning.util.ResponseStatusEnum;

@RestController
@RequestMapping("/delete")
public class DeleteCourseController {

	private static final Logger _log = LoggerFactory.getLogger(DeleteCourseController.class);

	@Autowired
	private CourseService courseService;
	
    @RequestMapping("/deleteCourse")
    public JSONResponseModel<String> deleteCourse(@RequestParam int courseId) {
		_log.info("Delete user REST service called");
		JSONResponseModel<String> response = new JSONResponseModel<String>();
		
		boolean deleteStatus = courseService.deleteCourse(courseId);
		
		if(deleteStatus){
			response.setData("Successfully deleted course");
			response.setStatus(ResponseStatusEnum.SUCCESS.getStatus());
		}else{
			response.setData("Successfully deleted course");
			response.setStatus(ResponseStatusEnum.FAILED.getStatus());
		}
		
		return response;
    }
	
}
