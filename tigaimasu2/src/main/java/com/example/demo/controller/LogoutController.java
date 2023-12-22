package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpSession;

@Controller
public class LogoutController {

	@RequestMapping(path = "/logout", method = RequestMethod.GET)
	public String logoutGet(HttpServletRequest request) {
		return "logout";
	}

	@RequestMapping(path = "/logout", method = RequestMethod.POST)
	public String logoutPost(HttpSession session)
			throws Exception {

		session.removeAttribute("userId");

		return "redirect:login";
	}
}
