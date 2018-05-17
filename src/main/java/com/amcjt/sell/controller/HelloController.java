package com.amcjt.sell.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Administrator
 */
@RestController
public class HelloController {
    @RequestMapping(value = "/game", method = RequestMethod.GET)
    public String say(){
        return "hello world";
    }
}
