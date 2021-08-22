package com.madcoder.devlogapi.service;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.springframework.stereotype.Service;

import java.io.IOException;

@Service
public class CrawlingService {

    public String testCrawling() throws IOException {
        Document doc = Jsoup.connect("https://myauction.imweb.me/22/?&page=1&sort=recent").get();

        return title;
    }
}
