package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.example.demo.service.LoginService;

import jakarta.servlet.http.HttpServletRequest;

@Controller
public class LoginController {

	@Autowired
	JdbcTemplate jdbcTemplate;

	@RequestMapping(path = "/login", method = RequestMethod.GET)
	public String input1(HttpServletRequest request) {

		return "login";
	}

	@RequestMapping(path = "/login", method = RequestMethod.POST)
	public String input2(HttpServletRequest request, String userId, String userPassword) {

		/*ホーム画面のURLたたく*/
		/*間違ってたらエラーメッセージ表示*/
		LoginService loginService = new LoginService();
		Boolean loginresult = loginService.LoginCheck(userId, userPassword, jdbcTemplate);

		if (loginresult) {
			System.out.println("YES");
		} else {
			System.out.println("NO");
		}

		return "login";
	}
}
