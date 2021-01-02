package com.mxxk.designPattern.Observer;

/**
 * Observer1
 *
 * @auther zhang
 * @date 2020/12/12
 **/
public class Observer1 implements Observer {

    @Override
    public void update() {
        System.out.println("observer1 has received!");
    }
}
