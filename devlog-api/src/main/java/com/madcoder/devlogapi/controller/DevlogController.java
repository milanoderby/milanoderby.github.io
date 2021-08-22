package com.madcoder.devlogapi.controller;

import com.madcoder.devlogapi.service.CrawlingService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.io.IOException;

@Controller
@RequiredArgsConstructor
public class DevlogController {

    private final CrawlingService crawlingService;

    @GetMapping("/crawling")
    @ResponseBody
    public String testCrawling() throws IOException {
        return crawlingService.testCrawling();
    }
}
