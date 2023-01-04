package com.example.projectBae.domain.sample.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class SampleController {

    @GetMapping("runa")
    public String findRuna(Model model){
        model.addAttribute("age", "17");
        return "sample";
    }

    @GetMapping("login")
    public String login(){
        return "login";
    }

}
