package com.example.demo;

import java.util.Scanner;

public class JavaTraining {
	public static void main(String[] args) {

		//オブジェクト指向でのhelloメソッド等の呼び出し//
		JavaObject object = new JavaObject("Java", 26, 175.0, 75.0); //インスタンスの生成

		object.hello();
		object.printData(); //個人データをまとめたメソッドを呼び出す。//

		System.out.println("-------------------------------------------------");
		Scanner scanner = new Scanner(System.in);      //キーボード入力・表示
		System.out.print("移動する距離を入力してください(km)：");
		int i = scanner.nextInt();
		object.run(i);							//キーボードからの入力を引数にする
		scanner.close();
	}
}
