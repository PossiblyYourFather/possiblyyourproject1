package com.frhsd._rsire.possiblyyouremailclient;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class PageController {

    @GetMapping("/")
    public String index() {
        return "index"; // Spring Boot will look for index.html in src/main/resources/templates/
    }
}