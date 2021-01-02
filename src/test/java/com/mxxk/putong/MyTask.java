package com.mxxk.putong;



import java.util.Date;
import java.util.TimerTask;

/**
 * MyTask
 *
 * @auther zhang
 * @date 2020/11/24
 **/
public class MyTask extends TimerTask {

    @Override
    public void run() {
        System.out.println("当前的时间是："+new Date());
    }
}
