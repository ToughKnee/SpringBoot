package com.ytth.demo.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class HomeControllers {

  @GetMapping({"/", "ae"}) //This function will redirect someone to the "/index", its like someone was going "out of bounds" and you send them back to the start
  public String home() {
    return "redirect:/student";
  }
  
}
