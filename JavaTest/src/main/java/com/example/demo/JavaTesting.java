package com.example.demo;
import java.io.File;
import java.io.IOException;
//import java.io.FileWriter;
import java.io.PrintWriter;

public class JavaTesting{
    public static void main(String[] args) {
        try {
            File file = new File("test.txt");

            /*FileWriter fw = new FileWriter(file); //ファイルを開く
        	fw.write("こんにちは");
        	fw.write("こんにちは");
        	fw.close();*/

            PrintWriter pw = new PrintWriter(file);//改行
            pw.println("1");			//ファイルに書き込む
            pw.println("sekine");
            pw.println("こんにちは");
            pw.close();			//ファイルを閉じる*/

        } catch (IOException ex) {		//ファイルがなかった時の為の処理
            ex.printStackTrace();
        }
    }
}