package com.example.demo.dao;

import java.time.LocalDateTime;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.Post;

@Repository
public class PostDao {

	@Autowired
	private JdbcTemplate jdbcTemplate;

	/* 新規投稿 */
	public void postinsert(String user_id, String post, String stamp, LocalDateTime timestamps, int id) {
		String sql = "INSERT INTO timeline (user_id, post, stamp, timestamps) VALUES (?, ?, ?, ?)";
		jdbcTemplate.update(sql, user_id, post, stamp, timestamps);
	}

	/* タイムラインの情報を取得 */
	public List<Post> getpostview() {
		String sql = "SELECT * FROM timeline";
		return jdbcTemplate.query(sql, new BeanPropertyRowMapper<>(Post.class));
	}
}
