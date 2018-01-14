package com.buzheng.me.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by buzheng on 18/1/14.
 */
@RestController
@RequestMapping("/")
public class WelcomeController {
    @ResponseBody
    @RequestMapping("/index")
    public String index() {
        return "hello world";
    }
}
