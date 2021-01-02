package com.mxxk.designPattern.Bridge;

/**
 * SourceSub1
 *
 * @auther zhang
 * @date 2020/12/8
 **/
public class SourceSub1 implements Sourceable {

    @Override
    public void method() {
        System.out.println("this is the first sub!");
    }
}
