package com.mxxk.designPattern.adapter.interfaceAdapter;

/**
 * TestDemo
 *
 * @auther zhang
 * @date 2020/12/6
 **/
public class TestDemo {
    public static void main(String[] args) {
        Sourceable s1=new SourceSub1();
        Sourceable s2=new SourceSub2();

        s1.method1();
        s1.method2();
        s2.method1();
        s2.method2();
    }
}
