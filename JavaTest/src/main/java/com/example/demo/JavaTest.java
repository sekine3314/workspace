package com.example.demo;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

class JavaTest {
    public static void main(String[] args) {

        try{
            //出力先ファイルのFileオブジェクトを作成
            File file = new File("test2.txt");

            //BufferedWriterオブジェクトを作成（追記モード）
            //FileWriterオブジェクトをBufferedWriterでラッピング
            BufferedWriter bw = new BufferedWriter(new FileWriter(file, true));
            //変数に代入後、表示もできることを確認
            String i = "高校";
            String t = "野球";
            //文字列を出力
            bw.write(i);
            bw.write(t);
            bw.newLine();

            //BufferedWriterオブジェクトをクローズ
            bw.close();

        } catch(IOException e) {
            System.out.println(e);	//エラーが起きたらエラー内容を表示する。
        }
    }
}