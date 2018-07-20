package com.example.demo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
 
/**
 *
 * @author masa
 */
@Controller
@EnableAutoConfiguration
public class Langage2 {
   
    @RequestMapping("/hello")
    public String hello(@RequestParam(value="name", required=false, defaultValue="masa") String name, Model model) {
        model.addAttribute("name", name);
	return "hello";
    }
 
    public static void main(String[] args) {
        SpringApplication.run(Langage2.class, args);
    }
    
}