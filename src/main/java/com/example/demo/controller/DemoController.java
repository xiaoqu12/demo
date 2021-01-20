package com.example.demo.controller;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
public class DemoController {


    @RequestMapping("/demo01")
    public Result demo01(){

        return new Result(true,"success");

    }
}

