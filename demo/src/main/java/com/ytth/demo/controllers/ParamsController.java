package com.ytth.demo.controllers;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/params") //Change this "GetMapping" to see what happens
public class ParamsController {

  @GetMapping("/")//Method that SENDS info to the URL using thymeleaf and an "anchor" in HTML
  public String index()
  {
    return "params/index";
  }

  @GetMapping("/string")
  public String params(@RequestParam(name = "text", defaultValue = "nothing given") String text, Model model) //Nota como aqui se llama "RequestPARAM"
  {
    model.addAttribute("res", "The sent text was:" + text);

    return "params/view";
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
