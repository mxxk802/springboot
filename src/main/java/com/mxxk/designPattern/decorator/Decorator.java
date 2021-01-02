package com.mxxk.designPattern.decorator;

/**
 * Decorator
 *
 * @auther zhang
 * @date 2020/12/7
 **/
public class Decorator implements Sourceable {

    private SourceData sourceData;

    public Decorator(SourceData sourceData) {

        this.sourceData = sourceData;
    }

    @Override
    public void method() {
        System.out.println("before decorator!");

        sourceData.method();

        System.out.println("after decorator!");
    }
}
