package com.example.demo.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.room;

@Repository
public class RoomCreateDao {

	@Autowired
	JdbcTemplate jdbcTemplate;

	/* 新しい部屋を作成するメソッド */
	public void createRoom(String roomName, String time, String introduction, String site, int random_bit,
			int approval_bit) {
		String sql = "INSERT INTO room (room_name, site, time, introduction, random_bit, approval_bit) VALUES (?, ?, ?, ?, ?, ?)";
		jdbcTemplate.update(sql, roomName, introduction, time, site, random_bit, approval_bit);
	}

	/* ルーム一覧を取得するメソッド */
	public List<room> getRoomList() {
		String sql = "SELECT * FROM room";
		return jdbcTemplate.query(sql, new BeanPropertyRowMapper<>(room.class));
	}
}