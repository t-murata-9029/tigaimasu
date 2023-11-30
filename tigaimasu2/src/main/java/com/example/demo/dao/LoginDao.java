
package com.example.demo.dao;

import java.util.Map;

import org.springframework.jdbc.core.JdbcTemplate;

public class LoginDao {

	/*上からもらったIDとPasswordでセレクト文実行、結果を返す*/
	public Map<String, Object> getUserInfo(String userId, String userPassword, JdbcTemplate jdbcTemplate) {

		String sql = "SELECT COUNT(*) as num FROM users WHERE user_id = ? AND user_password = ? LIMIT 1;";

		Map<String, Object> resultMap = jdbcTemplate.queryForMap(sql, userId, userPassword);

		return resultMap;
	}
}
