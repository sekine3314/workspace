package com.example.demo;
import java.io.IOException;
import java.io.PrintWriter;

public class JavaTesting{
    public static void main(String[] args) {
        try {
            //FileWriter fw = new FileWriter("test.txt"); //ファイルを開く
        	PrintWriter pw = new PrintWriter("test.txt");//改行
            pw.println("1");			//ファイルに書き込む
            pw.println("sekine");
            pw.println("こんにちは");
            pw.close();			//ファイルを閉じる
        } catch (IOException ex) {		//ファイルがなかった時の為の処理
            ex.printStackTrace();
        }
    }
}