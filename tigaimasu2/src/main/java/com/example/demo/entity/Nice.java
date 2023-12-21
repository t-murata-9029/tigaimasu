package com.example.demo.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Nice {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	String user_id;

	String post_id;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = (Long) id;
	}

	public String getUser_id() {
		return user_id;
	}

	public void setUser_id(String user_id) {
		this.user_id = user_id;
	}

	public String getPost_id() {
		return post_id;
	}

	public void setPost_id(String post_id) {
		this.post_id = post_id;
	}

}