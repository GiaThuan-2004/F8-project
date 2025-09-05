package com.project.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class Project1Controller {
    @GetMapping("/project1")
    public String start() {
        return "project1";
    }
}
