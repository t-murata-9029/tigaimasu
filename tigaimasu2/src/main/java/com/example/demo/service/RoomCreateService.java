package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.RoomCreateDao;
import com.example.demo.entity.room;

/* RoomCreateServiceクラス */
@Service
public class RoomCreateService {

	@Autowired
	RoomCreateDao roomCreateDao;

	/* RoomCreateServiceクラス */
	public List<room> roomCreateService(String roomName, String introduction, String time, String site, int random_bit,
			int approval_bit) {
		roomCreateDao.createRoom(roomName, time, site, introduction, random_bit, approval_bit);
		return null;
	}

	public List<room> getRoomList() {
		return roomCreateDao.getRoomList();
	}
}
