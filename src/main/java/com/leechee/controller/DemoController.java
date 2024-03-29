package com.leechee.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/demo")
public class DemoController {

    @GetMapping("/hello")
    public String hello(Model model) {
        model.addAttribute("name", "leechee");
        return "hello";
    }
}
