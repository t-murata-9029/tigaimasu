package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
public class gitLoginController {
	@RequestMapping(path = "/gitpralogin", method = RequestMethod.GET)
	public String third() {
		return "gitlogin";
	}

	@RequestMapping(path = "/gitlogin", method = RequestMethod.POST)
	public String third(String name, String pass, RedirectAttributes rA) {
		rA.addAttribute("namae", name);
		rA.addAttribute("pasu", pass);

		if ("gitlogin".equals(name) && "gitpw".equals(pass)) {
			return "redirect:/gititemlist";
		} else {

			return "gitlogin";
		}

	}
}