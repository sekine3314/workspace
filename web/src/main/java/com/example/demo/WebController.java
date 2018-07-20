package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class WebController {
@RequestMapping(value = "/web", method = RequestMethod.GET)

public String index(WebForm form, Model model) {

     model.addAttribute("WebForm", form);
     return "Web";
}



@RequestMapping(value = "/outpg01", method = RequestMethod.POST)
public String confirm(@Validated @ModelAttribute WebForm form, BindingResult result, Model model) {
     if (result.hasErrors()) {
              return index(form, model);
     }
     return "outpg01";
}
}