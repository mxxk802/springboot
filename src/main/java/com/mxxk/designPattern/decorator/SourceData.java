package com.mxxk.designPattern.decorator;

/**
 * SourceData
 *
 * @auther zhang
 * @date 2020/12/7
 **/
public class SourceData  implements Sourceable{

    @Override
    public void method() {
        System.out.println("the original method!");
    }
}
