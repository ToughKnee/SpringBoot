package com.ytth.demo.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
@RequestMapping(value="/variables") //El "RequestMapping" se usa para clases
public class ControllerRoute 
{
  @GetMapping("/") 
  public String variables(Model model)
  {
    return "variables/index";
  }

  @GetMapping("/string/{pathh}") //Los derivados de "RequestMapping" se usan para las funciones, ver https://docs.spring.io/spring-framework/docs/current/javadoc-api/org/springframework/web/bind/annotation/RequestMapping.html
  public String variables(@PathVariable String pathh, Model model)
  {
    model.addAttribute("res", "The text sent via path was: " + pathh);
    return "variables/view";
  }

  @GetMapping("/string/{pathh}/{num}") //2 variables
  public String variables(@PathVariable String pathh, @PathVariable Integer num, Model model)
  {
    model.addAttribute("res", "The text sent via path was: " + pathh + " num: " + num);
    return "variables/view";
  }


}
  