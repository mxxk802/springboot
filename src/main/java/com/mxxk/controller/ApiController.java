package com.mxxk.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ApiController {

    @RequestMapping("api")
    public String getMessage(){
        return "this is a api test";
    }
}
