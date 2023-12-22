package com.example.demo.service;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.LoginDao;

@Service
public class LoginService {

	@Autowired
	LoginDao loginDao;

	public boolean LoginCheck(String userId, String userPassword) throws Exception {

		Map<String, Object> resultMap = loginDao.getUserInfo(userId, userPassword);

		if ((long) resultMap.get("num") == 1) {
			return true;
		} else {
			return false;
		}
	}
}
