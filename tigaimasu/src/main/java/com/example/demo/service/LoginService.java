package com.example.demo.service;

import com.example.demo.dao.LoginDao;

public class LoginService {
	public Boolean LoginCheck(String userId, String userPassward) {

		//DBにSQLぶち込んでその結果見る

		LoginDao loginDao = new LoginDao();
		loginDao.getUserInfo();

		return false;
	}
}