package com.example.demo.service;

import java.time.LocalDateTime;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Repository.PostRepository;
import com.example.demo.dao.PostDao;
import com.example.demo.entity.Post;

@Service
public class PostService {
	@Autowired
	PostRepository postRepository;

	@Autowired
	PostDao postDao;

	public void postinsert(String user_id, String post, String stamp, LocalDateTime timestamps, int id) {
		postDao.postinsert(user_id, post, stamp, timestamps, id);
		return;
	}

	public List<Post> getPostList() {
		return postDao.getpostview();
	}

}
