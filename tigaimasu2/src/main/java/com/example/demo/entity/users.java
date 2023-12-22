package com.example.demo.entity;

import java.sql.Date;

public class users {
	private String user_name;
	private String user_id;
	private String user_tell;
	private String user_mail;
	private Date user_birthday;
	private int user_gender;
	private String user_text;
	private int user_evaluation;
	private String user_passward;

	public String getUser_name() {
		return user_name;
	}

	public void setUser_name(String user_name) {
		this.user_name = user_name;
	}

	public String getUser_id() {
		return user_id;
	}

	public void setUser_id(String user_id) {
		this.user_id = user_id;
	}

	public String getUser_tell() {
		return user_tell;
	}

	public void setUser_tell(String user_tell) {
		this.user_tell = user_tell;
	}

	public String getUser_mail() {
		return user_mail;
	}

	public void setUser_mail(String user_mail) {
		this.user_mail = user_mail;
	}

	public Date getUser_birthday() {
		return user_birthday;
	}

	public void setUser_birthday(Date user_birthday) {
		this.user_birthday = user_birthday;
	}

	public int getUser_gender() {
		return user_gender;
	}

	public void setUser_gender(int user_gender) {
		this.user_gender = user_gender;
	}

	public String getUser_text() {
		return user_text;
	}

	public void setUser_text(String user_text) {
		this.user_text = user_text;
	}

	public int getUser_evaluation() {
		return user_evaluation;
	}

	public void setUser_evaluation(int user_evaluation) {
		this.user_evaluation = user_evaluation;
	}

	public String getUser_passward() {
		return user_passward;
	}

	public void setUser_passward(String user_passward) {
		this.user_passward = user_passward;
	}

}
