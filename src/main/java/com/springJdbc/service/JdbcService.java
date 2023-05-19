package com.springJdbc.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

import com.springJdbc.entity.Student;

@Service
public class JdbcService {
	@Autowired
	private JdbcTemplate jdbcTemplate;

	public String insertData(Student student) {
		String sql = "INSERT INTO STUDENT(ID,NAME,CITY) VALUES (?,?,?)";
		Object args[] = {student.getId(), student.getName(), student.getCity() };
		jdbcTemplate.update(sql, args);
		return "Student data inserted";
	}
}
