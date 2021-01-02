package com.mxxk.designPattern.chain;

import java.util.Map;

/**
 * FirstCommand
 *
 * @auther zhang
 * @date 2020/12/1
 **/
public class FirstCommand implements Command<Map<String, Object>>{
    public boolean execute(Map<String, Object> context){
        //doing something in here
        System.out.println("执行第一步");
        return true;
    }
}
