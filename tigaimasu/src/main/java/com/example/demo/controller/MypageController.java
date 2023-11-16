package com.example.demo.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class MypageController {

	// 仮のデータベースからの情報取得を模擬
	// 実際にはデータベースからデータを取得するメソッドを呼び出す必要があります
	private UserData getUserDataFromDatabase() {
		UserData userData = new UserData();
		userData.setUsername("John Doe");
		userData.setUserRating("★★★☆☆");
		userData.setUserComment("良いユーザーです。");

		// プロフィール情報
		ProfileData profileData = new ProfileData();
		profileData.setAge(25);
		profileData.setGender("男性");
		profileData.setBirthday("1998-01-01");
		profileData.setProfileComment("私はプロフィールです。");

		// 参加中ルーム
		List<String> joinedRooms = new ArrayList<>();
		joinedRooms.add("ルーム1");
		joinedRooms.add("ルーム2");
		joinedRooms.add("ルーム3");

		// 開催中ルーム
		List<String> hostedRooms = new ArrayList<>();
		hostedRooms.add("ルームA");
		hostedRooms.add("ルームB");

		// フォロー・フォロワー一覧
		List<String> followingList = new ArrayList<>();
		followingList.add("ユーザーA");
		followingList.add("ユーザーB");
		followingList.add("ユーザーC");

		List<String> followersList = new ArrayList<>();
		followersList.add("フォロワーX");
		followersList.add("フォロワーY");

		// データをセット
		userData.setProfileData(profileData);
		userData.setJoinedRooms(joinedRooms);
		userData.setHostedRooms(hostedRooms);
		userData.setFollowingList(followingList);
		userData.setFollowersList(followersList);

		return userData;
	}

	@RequestMapping(path = "/mypage", method = RequestMethod.GET)
	public String myPage(Model model) {
		// データベースからユーザーデータを取得
		UserData userData = getUserData();

		// モデルにデータをセット
		model.addAttribute("userData", userData);

		// マイページを表示するHTMLファイル名を返す
		return "mypage";
	}
}
