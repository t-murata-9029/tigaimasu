package com.example.demo.controller;

import java.time.LocalDateTime;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.demo.entity.Nice;
import com.example.demo.entity.Post;
import com.example.demo.service.NiceService;
import com.example.demo.service.PostService;

@Controller
public class HomeController {

	@Autowired
	private PostService postService;

	@Autowired
	private NiceService niceService;

	@GetMapping("/home")
	public String timeline(Model model) {
		List<Post> posts = postService.getPostList();
		model.addAttribute("posts", posts);

		List<Nice> niceList = niceService.getNiceList();
		model.addAttribute("niceList", niceList);

		return "timeline";
	}

	@PostMapping("/addPost")
	public String addPost(@RequestParam String user_id, @RequestParam String post, @RequestParam String stamp) {
		// 新規投稿を追加するロジックを追加
		LocalDateTime timestamp = LocalDateTime.now();
		int id = 1; // 仮の値、実際の値は適切な方法で設定する必要があります
		postService.postinsert(user_id, post, stamp, timestamp, id);

		return "redirect:/home";
	}

}
