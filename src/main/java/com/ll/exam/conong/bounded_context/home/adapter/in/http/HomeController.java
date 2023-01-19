package com.ll.exam.conong.bounded_context.home.adapter.in.http;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {
    @GetMapping("/")
    public String showHome() {
        return "usr/home/main";
    }
}
