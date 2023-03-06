package com.example.gitremote.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {
    @GetMapping("/")
    public String index(){
        return "index";
    }

    @GetMapping("/shout")
    public String shout(){
        return "shout";
    }
}
