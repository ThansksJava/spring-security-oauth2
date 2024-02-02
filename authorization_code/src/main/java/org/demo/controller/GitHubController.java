package org.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/github")
public class GitHubController {


    @GetMapping("/hello")
    public String hello(@RequestParam("code") String code) {
        System.out.println("------");
        return code;
    }
}