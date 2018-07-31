package com.example.demo;

public class JavaObject {
	public String name; //インスタンスフィールド//
	public int age;
	public double height;
	public double weight;

	JavaObject(String name, int age, double height, double weight) { //コンストラクタ//
		this.name = name;
		this.age = age;
		this.height = height;
		this.weight = weight;
	}

	public void hello() { //インスタンスメソッド
		System.out.println("こんにちは" + "\n" + "元気ですか");
	}

	public void printData() {
		System.out.println("名前は" + this.name + "です");
		System.out.println("年齢は" + this.age + "歳です");
		System.out.println("身長は" + this.height + "です");
		System.out.println("体重は" + this.weight + "です");
	}
}
