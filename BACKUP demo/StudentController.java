package com.testing.demo;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.time.LocalDate;

@RestController
@RequestMapping(path = "api/std")
public class StudentController {

	@GetMapping
	public List<Student> student()
	{
		return List.of( new Student(1L, "Edgar", "hhhhhh", 
      LocalDate.of(2000, Month.JANUARY, 7), 21));
	}
  
}
