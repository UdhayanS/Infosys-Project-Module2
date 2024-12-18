package com.example.spot.manage.spotManage.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;


@Controller
public class HomeController {
    @GetMapping("/spotManage")
    public String home() {
        return "spotmanage";
    }
    
    @PostMapping("/submitForm")
    public String submit() {
        return "submi";
    }
}
