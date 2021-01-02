package com.mxxk.controller;

/**
 * helloword
 */

import org.springframework.stereotype.Controller;
import org.springframework.util.ConcurrentReferenceHashMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Map;

@Controller
public class HelloController {

    @RequestMapping("/hello")
    @ResponseBody
    public Map getInfo(){

        Map<String,Object> msg=new ConcurrentReferenceHashMap<>();
        msg.put("msg","这是一个简单的例子");
        System.out.println("增加新的更改");
        return msg;
    }
}
