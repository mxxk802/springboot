package com.mxxk.designPattern.chain;

import java.util.Map;

/**
 * SecondCommand
 *
 * @auther zhang
 * @date 2020/12/1
 **/
public class SecondCommand implements Command<Map<String, Object>>{

     public boolean execute(Map<String, Object> context){
        //doing something in here
        System.out.println("执行第二步");
        return true;
     }
}
