package com.example.demo;

public class JavaObject {
	public String name; //インスタンスフィールド//
	public int age;
	public double height;
	public double weight;
	public int distance = 0;
	public int limit = 100;

	JavaObject(String name, int age, double height, double weight) { //コンストラクタ//
		this.name = name;
		this.age = age;
		this.height = height;
		this.weight = weight;
	}

	public void hello() {			 //インスタンスメソッド
		System.out.println("こんにちは" + "\n" + "元気ですか");
		System.out.println("-------------------------------------------------");
	}

	public void printData() {
		System.out.println("名前は" + this.name + "です");
		System.out.println("年齢は" + this.age + "歳です");
		System.out.println("身長は" + this.height + "です");
		System.out.println("体重は" + this.weight + "です");
	}

	public void run(int distance) {		 //キーボードからの入力をメソッドで受け取る。
		if (distance >= this.limit) {		 //条件分岐の練習
			System.out.println("無謀です。移動するのはやめておきましょう");
		} else {
			this.distance = distance;
			System.out.println("運動するのはいいことです。移動しましょう！");
		}
		System.out.println("移動距離は" + this.distance + "kmです");
	}
}
