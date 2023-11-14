package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import jakarta.servlet.http.HttpServletRequest;

@Controller
public class gitItemEditController {

	@RequestMapping(path = "/gititemedit", method = RequestMethod.GET)
	public String input1(HttpServletRequest request) {
		return "gititemedit";
	}

	@RequestMapping(path = "/changeinfo", method = RequestMethod.POST)
	public String input2(HttpServletRequest request, Model model, String itemName, String itemPrice) {
		System.out.println(itemName + itemPrice);
		model.addAttribute("name", itemName);
		model.addAttribute("price", itemPrice);
		return "gitchangedinfo";
	}
}