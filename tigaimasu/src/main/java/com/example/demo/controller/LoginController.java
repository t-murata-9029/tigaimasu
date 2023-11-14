package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import jakarta.servlet.http.HttpServletRequest;

@Controller
public class LoginController {

	@RequestMapping(path = "/login", method = RequestMethod.GET)
	public String input1(HttpServletRequest request) {
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