package com.example.demo.controller;

import java.util.Random;

public class MergeHellController {
	public static void main(String[] args) {
		kadaiA();
		kadaiB();
		kadaiC();
	}

	// 1～100までのランダムな数字を抽出して○○が出たかどうかを表示するメソッド
	static void kadaiB() {
		// ランダムな数字を生成
		int randomNumber = RandomNumber(1, 100);

		// ○○が出たかどうかを表示
		DisplayResult(randomNumber, 42); // 42は仮の○○の値です。実際の値に置き換えてください。
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

	// 他の課題に関するメソッドも追加可能
	static void kadaiA() {
		// ここに課題Aの処理を書く
	}

	static void kadaiC() {
		// ここに課題Cの処理を書く
	}
}
