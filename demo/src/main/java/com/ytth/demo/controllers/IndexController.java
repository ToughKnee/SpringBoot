package com.ytth.demo.controllers;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;

import com.ytth.demo.models.Student;


@Controller
public class IndexController {

  @Value("${text.indexcontroller.index.title}")
  private String indexTitle;
  
  @Value("${text.indexcontroller.student.title}")
  private String studentTitle;

  @Value("${text.indexcontroller.list.title}")
  private String listTitle;
  


  @GetMapping({"/index", "/hi"}) // Putting brackets makes this be pathed to those  values in there (NOTE that parameters "value" and "path" are the same)
  public String index(Model model) 
  {
    model.addAttribute("title", indexTitle); //Model type is basically a "Map", because it required a "key": String AND its "value": Object, itcan also be replaced by "ModelMap" and "Map", but if we change it to Map  we must replace "addAttribute" with "put" and make the map templates  <String, Object>
    return "index";
  }

  @GetMapping(value="/student")
  public String student(Model model) 
  {
    Student stu = new Student(55778l, "Keti", "aaaeeof@gmail.com", 69);
    model.addAttribute("title", studentTitle);
    model.addAttribute("student", stu);

    return "student";
  }
  
  @GetMapping("/list")
  public String list(Model model) 
  {

    model.addAttribute("title", listTitle);
    // model.addAttribute("students", students);//This was used BEFORE the method "fillList" existed

    return "list";
  }

  @ModelAttribute("students") //Useful for sharing an "attribute" of the View in this context for others "Handler methods" of the controller
  public List<Student> fillList()
  {
    List<Student> students = Arrays.asList(
      new Student(55778l, "Keti", " cathartic@gmail.com", 69),
      new Student(74212l, "MSugged", "burdens@gmail.com", 3),
      new Student(56234l, "Aash", "then@gmail.com", 67),
      new Student(71554l, "Yon", "ditching@gmail.com", 99));

    return students;
  }
}
/* 
//=====================================  Interesting stuff

//=======  variables/index.html
Whats funny here is not about variables per se, its about how tyhmeleaf works when used with the anchors and the "@{}" thing to redirect the user to other places


*/