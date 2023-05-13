package com.example.demo.controller;

import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RestEndpoints {

    public Course getEndpoint(@RequestParam(value="name", defaultValue = "Sprint Boot", required = false) String name,
                              @RequestParam(value="name", defaultValue = "Sprint Boot", required = false) int chapterCount){
        return new Course(name,chapterCount);
    }
}
