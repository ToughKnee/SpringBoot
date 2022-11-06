package com.ytth.demo.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
@RequestMapping(value="/variables")
public class ControllerRoute 
{
  @GetMapping("/string/{pathh}") 
  public String variables(@PathVariable String pathh, Model model)
  {


    return "variables/view"
  }
}
  