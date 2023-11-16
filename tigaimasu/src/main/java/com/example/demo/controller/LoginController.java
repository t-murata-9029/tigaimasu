package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
public class LoginController {
	@RequestMapping(path = "/login", method = RequestMethod.GET)
	public String third() {
		return "login";
	}

	@RequestMapping(path = "/login", method = RequestMethod.POST)
	public String third(String name, String pass, RedirectAttributes rA) {
		rA.addAttribute("name", name);
		rA.addAttribute("password", pass);

		if ("login".equals(name) && "password".equals(pass)) {
			return "redirect:/home";
		} else {

			return "login";
		}

	}
}