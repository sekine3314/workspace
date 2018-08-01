package com.example.demo;

import java.util.Scanner;

public class JavaTraining {
	public static void main(String[] args) {

		//オブジェクト指向でのhelloメソッド等の呼び出し//
		JavaObject object = new JavaObject("shin", 26, 175.0, 75.0);
		Scanner scanner = new Scanner(System.in);      //キーボード入力・表示
		System.out.print("名前：");
		String name = scanner.next();
		System.out.println("名前は" + name + "です");

		object.hello();
		object.printData(); //個人データをまとめたメソッドを呼び出す。//

	}
}
