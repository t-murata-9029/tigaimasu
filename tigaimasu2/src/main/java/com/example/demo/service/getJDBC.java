package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository //もしかしたらサービスかも？？
public class getJDBC {
	@Autowired
	JdbcTemplate jdbcTemplate;

	public JdbcTemplate getJdbcTemplate() {
		return this.jdbcTemplate;
	}
}
