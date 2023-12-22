package com.example.demo.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.entity.users;

@Service
public class SignupService {
	public List signupCheck(users user) {

		//returun用の変数
		String returnText = "";

		//入力された情報がnullじゃないかチェック
		if (user.getUser_id() == null) {
			returnText += "ユーザーIDを入力してください。<br>";
		}
		if (user.getUser_name() == null) {
			returnText += "名前を入力してください。\n";
		}
		if (user.getUser_mail() == null) {
			returnText += "メールアドレスを入力してください。\n";
		}
		if (user.getUser_tell() == null) {
			returnText += "電話番号を入力してください。\n";
		}
		if (user.getUser_gender() == -1) {
			returnText += "性別を入力してください。\n";
		}

		return returnText;
	}
}
