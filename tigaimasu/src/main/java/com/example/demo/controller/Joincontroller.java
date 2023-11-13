package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class Joincontroller {

	@RequestMapping(path = "/join", method = RequestMethod.GET)
	public String getJoinPage(Model model) {
		return "join";
	}

	@RequestMapping(path = "/submit", method = RequestMethod.POST)
	public String submitForm(
			@RequestParam("username") String username,
			@RequestParam("email") String email,
			@RequestParam("password") String password,
			@RequestParam("birthday") String birthday,
			@RequestParam("gender") String gender,
			Model model) {

		// フォームデータを必要に応じて処理（例: データベースへ保存）

		model.addAttribute("username", username);
		model.addAttribute("email", email);
		model.addAttribute("password", password);
		model.addAttribute("birthday", birthday);
		model.addAttribute("gender", gender);

		// 確認ページや他のページにリダイレクト
		return "join";
	}
}
