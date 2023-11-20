
package com.example.demo.dao;

import java.util.Map;
import java.util.Map.Entry;

import org.springframework.jdbc.core.JdbcTemplate;

public class LoginDao {

	/*LoginDaoでDBアクセスしてデータ取ってくる。*/
	public String getUserInfo() {
		JdbcTemplate jdbcTemplate = new JdbcTemplate();

		String sql = "SELECT * FROM users WHERE user_id = 'sample_id'";

		Map<String, Object> oneUser = jdbcTemplate.queryForMap(sql);

		for (Entry<String, Object> a : oneUser.entrySet()) {
			System.out.println(a.getValue());
		}

		return null;
	}
}
