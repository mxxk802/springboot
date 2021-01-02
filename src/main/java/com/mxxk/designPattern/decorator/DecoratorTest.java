package com.mxxk.designPattern.decorator;

/**
 * DecoratorTest
 *
 * @auther zhang
 * @date 2020/12/7
 **/
public class DecoratorTest {

    public static void main(String[] args) {

        SourceData data=new SourceData();
        Sourceable source=new Decorator(data);
        source.method();
    }
}
