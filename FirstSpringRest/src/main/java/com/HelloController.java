package com;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController   //Understood that you will generate response.
                  //so @ResponseBody not used

public class HelloController {
   @RequestMapping("hello")
   public String hello() {
	   System.out.println("Welcome to Spring REST");
	   return "Welcome to Spring rest";
   }
}
