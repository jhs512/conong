package com.ll.exam.conong.bounded_context.voice.adapter.in.http;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/voice")
public class VoiceController {
    @GetMapping("/upload")
    public String showUpload() {
        return "/usr/voice/upload";
    }
}
