package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class JoinController {

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

		// 性別を数値に変換
		int genderValue;
		switch (gender) {
		case "male":
			genderValue = 1;
			break;
		case "female":
			genderValue = 2;
			break;
		case "other":
			genderValue = 3;
			break;
		default:
			genderValue = 0; // エラーなどに対応する場合は、適切な処理を追加
		}

		// データベースに登録する処理を追加

		model.addAttribute("username", username);
		model.addAttribute("email", email);
		model.addAttribute("password", password);
		model.addAttribute("birthday", birthday);
		model.addAttribute("gender", genderValue); // 数値で保存

		// 確認ページや他のページにリダイレクト
		return "confirmation";
	}
}
