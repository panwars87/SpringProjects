package ys.pdev.learning.controller;

import java.util.HashMap;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller	
public class StudentController {

	private static final Logger _log = (Logger) LoggerFactory.getLogger(StudentController.class);
	
	
	@RequestMapping("/student/login")
	public ModelAndView requestMapping() {
		_log.info("Inside view mapping");
		Map<String,Object> model = new HashMap<String,Object>();
		String message = "Hello World, Spring 4.0!";
		model.put("message", message);
		return new ModelAndView("main", model);
	}
	
}
