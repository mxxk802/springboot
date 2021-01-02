package com.mxxk.designPattern.chainResponsibility;

/**
 * Test
 *
 * @auther zhang
 * @date 2020/12/13
 **/
public class Test {

    public static void main(String[] args) {

        MyHandler h1 = new MyHandler("h1");
        MyHandler h2 = new MyHandler("h2");
        MyHandler h3 = new MyHandler("h3");

        h1.setHandle(h1);
        h2.setHandle(h2);
        h3.setHandle(h3);

        h1.operator();
        h2.operator();
        h3.operator();
    }
}
