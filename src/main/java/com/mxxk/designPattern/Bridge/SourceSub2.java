package com.mxxk.designPattern.Bridge;

/**
 * SourceSub2
 *
 * @auther zhang
 * @date 2020/12/8
 **/
public class SourceSub2 implements Sourceable {

    @Override
    public void method() {
        System.out.println("this is the second sub!");
    }
}
