package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.example.demo.entity.room;
import com.example.demo.service.RoomCreateService;

import jakarta.servlet.http.HttpServletRequest;

@Controller
public class RoomCreateController {
	@Autowired
	RoomCreateService roomCreateService;

	@RequestMapping(path = "/roomcreate", method = RequestMethod.GET)
	public String input1(HttpServletRequest request) {

		return "roomcreate";
	}

	/* RoomCreateControllerクラス */
	@RequestMapping(path = "/roomcreate", method = RequestMethod.POST)
	public String input(HttpServletRequest request, String room_name, String site, String time, String introduction,
			int random_bit, int approval_bit, Model model) {

		List<room> list = roomCreateService.roomCreateService(room_name, introduction, time, site, random_bit,
				approval_bit);
		model.addAttribute("roomList", list);
		return "redirect:/home";
	}

}