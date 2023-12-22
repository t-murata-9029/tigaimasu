package com.example.demo.controller;

import java.sql.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.example.demo.entity.users;
import com.example.demo.service.SignupService;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpSession;

@Controller
public class SignupController {

	@Autowired
	SignupService signupService;

	@RequestMapping(path = "/signup", method = RequestMethod.GET)
	public String signupGet(HttpServletRequest request, Model model) {
		model.addAttribute("errorText", "");
		return "signup";
	}

	@RequestMapping(path = "/signup", method = RequestMethod.POST)
	public String signupPost(HttpServletRequest request, HttpSession session, String user_name, String user_id,
			String user_tell, String user_mail, String user_birthday, String user_gender, Model model)
			throws Exception {

		users user = new users();
		user.setUser_name(user_name);
		user.setUser_id(user_id);
		user.setUser_tell(user_tell);
		user.setUser_mail(user_mail);
		if (user_birthday != null) {
			user.setUser_birthday(Date.valueOf(user_birthday));
		} else {
			user.setUser_birthday(null);
		}

		if (user_gender == null) {
			user.setUser_gender(-1);
		} else {
			user.setUser_gender(Integer.parseInt(user_gender));
		}
		String resultStr = signupService.signupCheck(user);

		if ("".equals(resultStr)) {
			return "redirect:/login";
		}
		model.addAttribute("errorText", resultStr);
		return "signup";
	}
}
