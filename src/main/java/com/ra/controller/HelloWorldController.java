package com.ra.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloWorldController {
    @RequestMapping(value = "/hello-world")
    public String hello(Model model){
        model.addAttribute("fullName","Nguyen Van A");
        return "helloWorld";
    }
}
