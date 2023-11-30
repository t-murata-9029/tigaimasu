package com.example.demo.service;

import java.util.Map;

import org.springframework.jdbc.core.JdbcTemplate;

import com.example.demo.dao.LoginDao;

public class LoginService {
	public boolean LoginCheck(String userId, String userPassword, JdbcTemplate jdbctemplate) {

		LoginDao loginDao = new LoginDao();
		Map<String, Object> resultMap = loginDao.getUserInfo(userId, userPassword, jdbctemplate);

		System.out.println(resultMap.get("num").getClass());

		if ((long) resultMap.get("num") == 1) {
			return true;
		} else {
			return false;
		}
	}
}
