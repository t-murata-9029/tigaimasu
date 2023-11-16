package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class RoomcreateController {

	@RequestMapping(path = "/roomcreate", method = RequestMethod.GET)
	public String getJoinPage(Model model) {
		return "roomcreate";
	}

	@RequestMapping(path = "/roomcreate", method = RequestMethod.POST)
	public String submitForm(
			@RequestParam("roomname") String roomname,
			@RequestParam("venue") String venue,
			@RequestParam("datetime") String datetime,
			@RequestParam("comment") String comment,
			Model model) {

		// フォームデータを必要に応じて処理（例: データベースへ保存）

		// データベースに登録する処理を追加

		model.addAttribute("roomname", roomname);
		model.addAttribute("venue", venue);
		model.addAttribute("datetime", datetime);
		model.addAttribute("comment", comment);

		// 確認ページや他のページにリダイレクト
		return "room";
	}
}
