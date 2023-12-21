package com.example.demo.entity;

import java.time.LocalDateTime;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "timeline")
public class Post {
	String user_id;
	String post;
	String stamp;
	LocalDateTime timestamps;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	public String getUser_id() {
		return user_id;
	}

	public void setUser_id(String user_id) {
		this.user_id = user_id;
	}

	public String getPost() {
		return post;
	}

	public void setPost(String post) {
		this.post = post;
	}

	public String getStamp() {
		return stamp;
	}

	public void setStamp(String stamp) {
		this.stamp = stamp;
	}

	public LocalDateTime getTimestamps() {
		return timestamps;
	}

	public void setTimestamps(LocalDateTime timestamps) {
		this.timestamps = timestamps;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = (Long) id;
	}

}
