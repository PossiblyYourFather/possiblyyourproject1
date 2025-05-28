package com.frhsd._rsire.possiblyyouremailclient;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class Test {

    @GetMapping("/")
    public String hello(Model model) {
        model.addAttribute("name", "Bob");
        model.addAttribute("age", 17);
        return "first"; // this matches hello.html
    }
}
