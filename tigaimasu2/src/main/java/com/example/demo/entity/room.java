package com.example.demo.entity;

import java.util.Date;

public class room {
	private int id;
	private String room_name;
	private String introduction;
	private String user_id;
	private Date time;
	private String site;
	private int random_bit;
	private int approval_bit;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getRoom_name() {
		return room_name;
	}

	public void setRoom_name(String room_name) {
		this.room_name = room_name;
	}

	public String getIntroduction() {
		return introduction;
	}

	public void setIntroduction(String introduction) {
		this.introduction = introduction;
	}

	public String getUser_id() {
		return user_id;
	}

	public void setUser_id(String user_id) {
		this.user_id = user_id;
	}

	public Date getTime() {
		return time;
	}

	public void setTime(Date time) {
		this.time = time;
	}

	public String getSite() {
		return site;
	}

	public void setSite(String site) {
		this.site = site;
	}

	public int getRandom_bit() {
		return random_bit;
	}

	public void setRandom_bit(int random_bit) {
		this.random_bit = random_bit;
	}

	public int getApproval_bit() {
		return approval_bit;
	}

	public void setApproval_bit(int approval_bit) {
		this.approval_bit = approval_bit;
	}

}
