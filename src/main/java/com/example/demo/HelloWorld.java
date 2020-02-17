package com.example.demo;

import java.util.List;
 

 import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
 
@RestController
public class HelloWorld {
    
 

    @RequestMapping("/")
    public @ResponseBody String root_test()throws Exception{
        return "Hello World";
    }
 
    @RequestMapping("/demo")
    public @ResponseBody String demo_test()throws Exception{
         return "demo";
    }
    
}