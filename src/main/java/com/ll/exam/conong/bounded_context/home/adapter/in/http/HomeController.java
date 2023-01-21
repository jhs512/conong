package com.ll.exam.conong.bounded_context.home.adapter.in.http;

import com.ll.exam.conong.standard.rq.Rq;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequiredArgsConstructor
public class HomeController {
    private final Rq rq;

    @GetMapping("/")
    public String showHome() {
        if ( rq.isLogined() ) {
            return Rq.redirect("/voice/upload");
        }

        return Rq.redirect("/account/login");
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
