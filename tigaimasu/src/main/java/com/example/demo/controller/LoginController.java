package com.example.demo.controller;

import java.util.Map;
import java.util.Map.Entry;

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
		String sql = "SELECT * FROM users WHERE user_id = 'sample_id'";

		Map<String, Object> oneUser = jdbcTemplate.queryForMap(sql);

		for (Entry<String, Object> a : oneUser.entrySet()) {
			System.out.println(a.getValue());
		}

		LoginService loginService = new LoginService();
		loginService.LoginCheck(null, null);
		return "login";
	}

	@RequestMapping(path = "/logincheck", method = RequestMethod.POST)
	public String input2(HttpServletRequest request, String userId, String userPassward) {

		/*DB接続してuserIdとuserPassward正しいかチェック(Serviceのメソッドで)*/
		/*正しかったらホーム画面のURLたたいてあげる*/
		/*間違ってたらエラーメッセージ表示*/

		return "hogehogehoge";
	}
}
