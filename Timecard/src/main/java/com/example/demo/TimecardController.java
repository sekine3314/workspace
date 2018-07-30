package com.example.demo;

import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.Date;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class TimecardController {
	@RequestMapping(value = {"/timecard"}, method = {RequestMethod.GET})
	public ModelAndView index() {

		// 生成
		ModelAndView mv = new ModelAndView();

		// テンプレートを指定
		mv.setViewName("sample.html");

		// 日時を取得、設定
		mv.addObject("now", new Date().toString());

		// 返却
		return mv;
	}

	// POST用のパラメータを受け取る
	@RequestMapping(value = {"/formpost"}, method = {RequestMethod.POST})
	public ModelAndView postTest1(
			@RequestParam(value="day", required = true) String day,
			@RequestParam(value="name", required = true) String name,
			@RequestParam(value="age", required = true) String age,
			@RequestParam(value="time", required = true) String time){

		//TODO 受け取った変数を処理する。
		try{
	        //出力先ファイルのFileオブジェクトを作成
	        //File file = new File("file.txt");

	        //BufferedWriterオブジェクトを作成（追記モード）
	        //FileWriterオブジェクトをBufferedWriterでラッピング
	        //BufferedWriter bw = new BufferedWriter(new FileWriter(file, true));
	        //変数に代入後、表示もできることを確認
	        FileOutputStream fos = new FileOutputStream("file.csv");
	        OutputStreamWriter osw = new OutputStreamWriter(fos, "SJIS");
	        BufferedWriter bw = new BufferedWriter(osw);
	        String n=name;
	        String a= age;
	        String t= time;
	        String d= day;
	        //文字列を出力
	        bw.write("\""+d+"\""+","+"\""+n+"\""+","+"\""+a+"\""+","+"\""+t+"\"");
	        bw.newLine();

	        //BufferedWriterオブジェクトをクローズ
	        bw.close();

	    } catch(IOException e) {
	        System.out.println(e);	//エラーが起きたらエラー内容を表示する。
	    	}

		// 生成
		ModelAndView mv = new ModelAndView();

		// テンプレートを指定(入力画面)
		mv.setViewName("index");

		// modelに設定して画面に表示するようにする
		mv.addObject("name", name);
		mv.addObject("age", age);
		mv.addObject("time", time);
		mv.addObject("day", day);

		// 返却
		return mv;
	}

	// GET用のパラメータを受け取る
	@RequestMapping(value = {"/formpost"}, method = {RequestMethod.GET})
	public ModelAndView getTest1(
			@RequestParam(value="day", required = true) String day,
			@RequestParam(value="name", required = true) String name,
			@RequestParam(value="age", required = true) String age,
			@RequestParam(value="time", required = true) String time){


		// 生成
		ModelAndView mv = new ModelAndView();

		// テンプレートを指定(出力画面)
		mv.setViewName("index");

		// modelに設定して画面に表示するようにする
		mv.addObject("name", name);
		mv.addObject("age", age);
		mv.addObject("time", time);
		mv.addObject("day", day);

		// 返却
		return mv;
	}

}