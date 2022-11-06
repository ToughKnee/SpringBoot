package com.ytth.demo.controllers;

import javax.annotation.Generated;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.thymeleaf.standard.expression.NumberTokenExpression;

@Controller
@RequestMapping("/params")
public class ParamsController {

  @GetMapping("/string")
  public String params(@RequestParam(name = "text", defaultValue = "nothing given") String text, Model model)
  {
    model.addAttribute("res", "The sent text was:" + text);

    return "params/view";
  }

  @GetMapping("/")//Method that SENDS info to the URL using thymeleaf and an "anchor" in HTML
  public String index()
  {
    return "params/index";
  }
  

  @GetMapping("/stringnum")
  public String params(@RequestParam String text, @RequestParam Integer num, Model model)
  {
    model.addAttribute("res", "The sent text was = " + text + " num = " + num);

    return "params/view";
  }

  @GetMapping("/httpserv")
  public String params(HttpServletRequest request, Model model)
  {
    String text = request.getParameter("text");
    int num;
    try{
      num = Integer.parseInt(request.getParameter("num"));
    }catch (NumberFormatException e){
      num = 0;
    }
    model.addAttribute("res", "The sent text was = " + text + " num = " + num);

    return "params/view";
  }

}
