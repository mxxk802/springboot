package com.mxxk.designPattern.Prototype;

/**
 * Test
 *
 * @auther zhang
 * @date 2020/12/16
 **/
public class Test {

    public static void main(String[] args) throws Exception{

        Prototype p1=new Prototype();
        p1.setString("hello");

        Prototype p2=(Prototype)p1.clone();
        p2.setString("world");

        Prototype p3=(Prototype)p1.deepClone();


        System.out.println(p1==p2);
        System.out.println(p1==p3);
    }
}
