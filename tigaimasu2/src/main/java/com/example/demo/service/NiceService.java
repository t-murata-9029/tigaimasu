package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

import com.example.demo.dao.NiceDao;
import com.example.demo.entity.Nice;

@Service
public class NiceService {
	@Autowired
	private NiceDao niceDao;

	@Autowired
	private JdbcTemplate jdbcTemplate;

	public List<Nice> getNice(String userId, Long postId) {
		// NiceRepositoryを使ってNice情報を取得する処理
		return niceDao.getNice(userId, postId);
	}

	public List<Nice> getNiceList() {
		// NiceDaoを使ってNice情報を取得する処理
		return niceDao.getniceview();
	}

	public void addNice(Nice newNice) {
		// NiceRepositoryを使って新しいNiceを追加する処理
		// niceRepository.save(newNice);
	}
}
