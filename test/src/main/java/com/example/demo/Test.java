package com.example.demo;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class Test {
	@RequestMapping("/test")
	@ResponseBody//@RestControllerをつけたメソッドにはつけなくていい。
		public String hello() {
			return "Hello World !!";
	}
			@RequestMapping("/world")
				public String world() {
					return "こんにちは";
			}
			}
