package com.springJdbc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springJdbc.entity.Student;
import com.springJdbc.service.JdbcService;

@RestController
@RequestMapping("/jdbc")
public class JdbcController {
	@Autowired
	private JdbcService jdbcService;

	@PostMapping("/insert")
	public String insertData(@RequestBody Student student) {
		return jdbcService.insertData(student);
	}
}
