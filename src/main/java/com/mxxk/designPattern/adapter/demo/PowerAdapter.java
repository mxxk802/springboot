package com.mxxk.designPattern.adapter.demo;

/**
 * PowerAdapter
 *
 * @auther zhang
 * @date 2020/12/6
 **/
public class PowerAdapter  extends Socket implements Transformer{


    @Override
    public void turnInto() {
        System.out.println("电源适配器转化220v为60v,电流转化为2A");
    }
}
