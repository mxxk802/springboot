package com.mxxk.putong;

import java.util.Date;
import java.util.Timer;

/**
 * TimerDemo
 *
 * @auther zhang
 * @date 2020/11/24
 **/
public class TimerDemo {

    public static void main(String[] args) throws Exception{

        System.out.println(new Date());

        Timer timer=new Timer();
        timer.schedule(new MyTask(),3000);
    }
}
