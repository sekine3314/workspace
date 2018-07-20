/*package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HelloController {

    @GetMapping("/hello")
    public String hello(Model model) {
        model.addAttribute("message", "Hello Thymeleaf!!");
        return "hello";
    }
}*/

package com.example.demo;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class HelloController {
	@RequestMapping("/hello")
	public String hello(){
		String str = "";
		str += "勤怠管理システム\n";
		str += "関根真一\n";
		str += "社員ナンバー\n";
		return str;
	}
}
/*	public static void action() {
		printData("Kate Jones");
		printData("John Christopher Smith");
	}

	public static void printData(String name) {
		System.out.println("私の名前は"+name+"です");
	}
}*/
