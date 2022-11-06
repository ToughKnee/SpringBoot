package com.ytth.demo.models;

import java.time.LocalDate;

public class Student 
{
  private Long id;  
  private String name;  
  private String email;  
  private LocalDate dob;  
  private Integer age;  

  public Student(
   Long id,
   String name,  
   String email,  
   Integer age)
   {
    this.id = id;  
    this.name = name;  
    this.email = email;
    this.age = age;  
   }
   
  //===========================  To  convert this class toJSON we must implement the getters
   public Long getId()
   {
    return id;
   }
   public  String getName()
   {
    return name;
   }
   public  LocalDate getDob()
   {
    return dob;
   }
   public  String getEmail()
   {
    return email;
   }
   public int getAge()
   {
    return age;
   }
   //=====  

   @Override
   public String toString()
   {
    return "Student: " +
      "id: " + id + 
      ", name: " +  name + 
      ", email: " +  email + 
      ", dob: " + dob + 
      ", age: " +  age;
   }

   
}
