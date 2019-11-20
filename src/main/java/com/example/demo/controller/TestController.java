package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author:wanzhongsu
 * @description: 测试
 * @date:2019/11/20 11:08
 */
@RestController
@RequestMapping("/test")
public class TestController {
    @GetMapping("/test1")
    public Object test1() {
        return "test1";
    }
}
