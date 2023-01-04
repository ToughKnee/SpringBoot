package com.ytth.demo;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.PropertySources;

//This class exists only to make this application compatible with different properties files, to make the "application.properties" more meaningful
@Configuration
@PropertySources({
  @PropertySource("classpath:text.properties")
  //, @PropertySource("classpath:text.properties2") This way you can have more variables set in different files
})
public class TextsConfigProperties {
  
}
