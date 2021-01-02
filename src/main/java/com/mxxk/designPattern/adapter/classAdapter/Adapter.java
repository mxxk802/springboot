package com.mxxk.designPattern.adapter.classAdapter;

/**
 * Adapter
 *
 * @auther zhang
 * @date 2020/12/6
 **/
public class Adapter extends Source implements Targetable {

    @Override
    public void method2() {
        System.out.println("this is a target method");
    }
}
