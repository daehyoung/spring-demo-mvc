package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping; 

@Controller
public class Greeting{

    @RequestMapping("/greeting")
    public String greeting()throws Exception{
        return "index";
    }

}