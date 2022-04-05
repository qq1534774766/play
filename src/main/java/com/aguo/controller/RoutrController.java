package com.aguo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class RoutrController {
    @RequestMapping("/")
    public String index(){
        return "index";
    }
}
