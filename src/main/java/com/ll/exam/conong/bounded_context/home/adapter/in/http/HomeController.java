package com.ll.exam.conong.bounded_context.home.adapter.in.http;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HomeController {
    @GetMapping("/")
    public String showHome() {
        return "usr/home/main";
    }

    @GetMapping("/home/about")
    public String showAbout() {
        return "usr/home/about";
    }

    @GetMapping("/version")
    @ResponseBody
    public int showVersion() {
        return 15;
    }
}
