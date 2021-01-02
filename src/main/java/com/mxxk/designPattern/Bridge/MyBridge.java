package com.mxxk.designPattern.Bridge;

/**
 * MyBridge
 *
 * @auther zhang
 * @date 2020/12/8
 **/
public class MyBridge extends Bridge {

    @Override
    public void method() {
        getSource().method();
    }
}
