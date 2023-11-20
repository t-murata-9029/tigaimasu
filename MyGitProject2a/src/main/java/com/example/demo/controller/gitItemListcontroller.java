package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class gitItemListcontroller {

	@RequestMapping(path = "/gititemlist", method = RequestMethod.GET)
	public String gitItemList(Model model) {

		return "gititemlist";
	}
}
