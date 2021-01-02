package com.mxxk.designPattern.adapter.demo;

/**
 * Test
 *
 * @auther zhang
 * @date 2020/12/6
 **/
public class Test {
    public static void main(String[] args) {
        Transformer transfor=new PowerAdapter();
        transfor.outPut();
        transfor.turnInto();
    }
}
