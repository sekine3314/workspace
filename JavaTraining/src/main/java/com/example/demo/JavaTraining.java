package com.example.demo;

public class JavaTraining {
	public static void main(String[] args) {

		//Hello,world 表示//
		System.out.println("Hello,world");



		//オブジェクト指向でのhelloメソッド等の呼び出し//
		JavaObject object = new JavaObject("shin", 26, 175.0, 75.0);
		object.hello();
		object.printData(); //個人データをまとめたメソッドを呼び出す。//




		//配列の練習問題//
		double total = 0;
		double avr = 0;
		double[] number = { 12.3, 13.5, 11.5, 13.0, 12.8, 12.5 };
		for (int i = 0; i < number.length; i++) {
			total += number[i];
			avr = total / number.length;
			System.out.print(number[i] + "\t");
		}
		System.out.print("\n");
		System.out.println("合計は" + total + "です");
		System.out.println("平均は" + avr + "です");
	}
}
