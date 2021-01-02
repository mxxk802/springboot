package com.mxxk.designPattern.strategy.demo2;

/**
 * House
 *
 * @auther zhang
 * @date 2020/11/30
 **/
public class House implements Building {

    @Override
    public String getType() {
        return "house";
    }
}
