package com.wp.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * description
 *
 * @author 文攀 2019/09/29 17:35
 */
@RestController
public class HelloController {

    @GetMapping(value = "/hello")
    @ResponseBody
    public String hello(){
        System.out.println("============>>>  test jenkins !!!!");
        return "hello";
    }
}
