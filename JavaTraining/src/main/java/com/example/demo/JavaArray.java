package com.example.demo;

public class JavaArray {
	public static void main(String[] args) {
	//配列の通過テスト 参考書p168//
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

System.out.println("-------------------------------------------------------------");


	//配列の通過テスト 参考書p168//
			String[] name = {"田中","中村","鈴木","山本","本田"};
			int[] kokugo = {82,85,74,90,70};
			int[] eigo = {70,74,88,74,82};
			double totall = 0;
			double avre = 0;
			double englishsum = 0;
			double englishAvr = 0;
			double totalSum = 0;

			for(int y =0;y<kokugo.length;y++) {		//拡張for文で書くと
				totall += kokugo[y];								//for(int y : kokugo)
				avre = totall / kokugo.length;					//totall += y
			}
				for(int z =0;z<eigo.length;z++) {
					englishsum += eigo[z];
					englishAvr = englishsum / eigo.length;
				}

				totalSum = (avre + englishAvr) / 2;

				System.out.println("国語平均＝" + avre);
				System.out.println("英語平均＝" + englishAvr);
				System.out.println("科目平均＝" + totalSum);

				for(int w =0;w<name.length;w++) {
					System.out.println(name[w] + ":" + (double)(kokugo[w] + eigo[w]) / 2);
				}
		}
}
