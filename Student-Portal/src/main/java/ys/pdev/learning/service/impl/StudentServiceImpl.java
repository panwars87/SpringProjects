package ys.pdev.learning.service.impl;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ys.pdev.learning.controller.LoginController;
import ys.pdev.learning.model.Student;
import ys.pdev.learning.repository.StudentRepository;
import ys.pdev.learning.service.StudentService;

@Service("loginService")
public class StudentServiceImpl implements StudentService{
	
	private static final Logger _log = LoggerFactory.getLogger(StudentService.class);
	
	@Autowired
	private StudentRepository studentRepository;
	
	public boolean authenticateUser(Student student){
		_log.info("Inside authenticate User service impl");
		return studentRepository.authenticateStudent(student);
	}
}
