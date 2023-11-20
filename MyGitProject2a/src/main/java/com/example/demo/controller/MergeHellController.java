package com.example.demo.controller;

import java.util.Random;

public class MergeHellController {
	public static void main(String[] args) {
		kadaiA();
		kadaiB();
		kadaiC();
	}

	static void kadaiA() {
		for (int i = 0; i < 10; i++) {
			System.out.println("現在" + i + "回目のループです");
		}
	}

	static void kadaiC() {
		int a = 50;
		int b = 75;

		int c = a + b;

		System.out.println(c);
	}

	// 1～100までのランダムな数字を抽出して○○が出たかどうかを表示するメソッド
	static void kadaiB() {
		// ランダムな数字を生成
		int randomNumber = RandomNumber(1, 100);

		// ○○が出たかどうかを表示
		DisplayResult(randomNumber, 77);
	}

	// 指定された範囲内のランダムな整数を生成するメソッド
	static int RandomNumber(int min, int max) {
		Random random = new Random();
		return random.nextInt(max - min + 1) + min;
	}

	// 結果をチェックして表示するメソッド
	static void DisplayResult(int number, int target) {
		if (number == target) {
			System.out.println(target + "が出ました！");
		} else {
			System.out.println(target + "は出ませんでした。");
		}
	}
}
