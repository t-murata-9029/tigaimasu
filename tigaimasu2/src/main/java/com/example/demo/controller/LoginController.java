package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.example.demo.service.LoginService;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpSession;

@Controller
public class LoginController {

	@Autowired
	LoginService loginService;

	@RequestMapping(path = "/login", method = RequestMethod.GET)
	public String loginGet(HttpServletRequest request) {
		return "login";
	}

	@RequestMapping(path = "/login", method = RequestMethod.POST)
	public String loginPost(HttpServletRequest request, String userId, String userPassword, HttpSession session)
			throws Exception {

		/*ホーム画面のURLたたく*/
		/*間違ってたらエラーメッセージ表示*/
		Boolean loginresult = loginService.LoginCheck(userId, userPassword);

		/*一致するユーザーIDとパスワードがあったらhomeに遷移*/
		if (loginresult) {
			session.setAttribute("userId", userId);
			return "login";
		} else {
			return "login";
		}

	}
}
