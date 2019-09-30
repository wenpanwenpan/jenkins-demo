package com.wp.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * description
 *
 * @author 文攀 2019/09/29 17:35
 */
@Controller
public class HelloController {

    @GetMapping(value = "/hello")
    public String hello(){
        System.out.println("============>>>  test jenkins !!!!");
        return "hello wenpan";
    }
}
