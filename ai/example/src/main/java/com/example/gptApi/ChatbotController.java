package com.example.gptApi;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ChatbotController {

    @RequestMapping("/")
    public String chat() {
        return "chat.html";
    }
    @RequestMapping("/input")
    public String input() {
        return "input_article.html";
    }
}