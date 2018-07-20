package com.example.demo;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class HelloController {
	@RequestMapping("/hello")
		public String hello() {
		return "Hello World !!";
	}
}


/*package com.example.demo;

@Controller
@RequestMapping("/hello")
public class HelloController {

    @RequestMapping(method = RequestMethod.GET)
    public String test(Model model) {
        return "hello";
    }

}

/*
@Controller
@RequestMapping("/sample")
public class HelloController {

    @RequestMapping(method = RequestMethod.GET)
    public String test(Model model) {
        model.addAttribute("name", "勤怠管理システム");
        model.addAttribute("get", "IN");
        model.addAttribute("post", "OUT");
        return "sample/index";
    }

}
*/