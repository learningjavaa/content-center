package com.example.contentcenter.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@Slf4j
public class ContentController {

    @Autowired
    private RestTemplate restTemplate;

    @GetMapping("/user")
    public String getUserId() {
        String s = this.restTemplate
                .getForObject("http://user-center/user",String.class);
        return s;
    }

}
