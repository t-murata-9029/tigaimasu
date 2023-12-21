package com.example.demo.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.Nice;

@Repository
public class NiceDao {

	@Autowired
	private JdbcTemplate jdbcTemplate;

	/* ナイスinsert */
	public void niceinsert(int id, String user_id, String post_id) {
		String sql = "INSERT INTO nice (id, user_id, post_id ) VALUES (?, ?, ?)";
		jdbcTemplate.update(sql, id, user_id, post_id);
	}

	/* タイムラインの情報を取得 */
	public List<Nice> getniceview() {
		String sql = "SELECT * FROM nice";
		return jdbcTemplate.query(sql, new BeanPropertyRowMapper<>(Nice.class));
	}

	public List<Nice> getNice(String userId, Long postId) {
		String sql = "SELECT * FROM nice WHERE user_id = ? AND post_id = ?";
		return jdbcTemplate.query(sql, new BeanPropertyRowMapper<>(Nice.class), userId, postId);
	}

}
