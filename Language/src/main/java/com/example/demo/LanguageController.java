package com.example.demo;
import java.util.LinkedHashMap;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class LanguageController {
	/*@RequestMapping("/hello")
	public String hello(@RequestParam(value="", required=false, defaultValue="") String name,Model model){
		model.addAttribute("name", name);
		String str = "";
		str += "勤怠管理システム\n";
		return "hello";
	}*/
    // トップページ
    @RequestMapping(value = "/index")
    public String index(Model model) {
        // ラジオボタンの選択肢
        Map<String, String> languageMap = new LinkedHashMap<String, String>();
        languageMap.put("山田", "山田");
        languageMap.put("佐藤", "佐藤");
        languageMap.put("小島", "小島");

        model.addAttribute("languageMapItems",languageMap);

        // ビューの表示時にインスタンスを渡さないとエラーが出るので、その対策
        model.addAttribute("languageForm", new LanguageForm());
        return "index";
    }

    // 確認ページ
    @RequestMapping(value = "/confirm", method = RequestMethod.GET)
    public String confirm(@ModelAttribute LanguageForm languageForm, Model model) {
        return "confirm";
    }
}
