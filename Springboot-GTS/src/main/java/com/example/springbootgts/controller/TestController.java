package com.example.springbootgts.controller;

import com.example.springbootgts.common.Result;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/test")
public class TestController {

    @GetMapping
    public Result test(){
        Result a = new Result<>("测试成功！");
        return a;
    }
}
