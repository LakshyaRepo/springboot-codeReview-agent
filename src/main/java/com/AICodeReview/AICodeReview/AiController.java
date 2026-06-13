package com.AICodeReview.AICodeReview;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/ai")
public class AiController {

    private final GeminiService geminiService;

    @Autowired
    public AiController(GeminiService geminiService) {
        this.geminiService = geminiService;
    }

    @GetMapping
    public String ask(@RequestParam String prompt) {
        return geminiService.askGemini(prompt);
    }
}
