package com.ll.exam.conong.bounded_context.account.adapter.in.http;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/account")
@RequiredArgsConstructor
@Slf4j
public class AccountController {
    @GetMapping("/login")
    public String showLogin() {
        return "usr/account/login";
    }
}
