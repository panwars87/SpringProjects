package ys.pdev.learning.repository;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import ys.pdev.learning.model.Student;

@Repository("studentRepository")
public class StudentRepository {
	private static final Logger _log = LoggerFactory.getLogger(StudentRepository.class);
	
	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	public boolean authenticateStudent(Student student){
		_log.info("Inside authenticate User repo");
		return false;
	}
	
}
