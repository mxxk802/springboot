package com.mxxk.designPattern.adapter.objectAdapter;

/**
 * Test
 *
 * @auther zhang
 * @date 2020/12/6
 **/
public class Test {
    public static void main(String[] args) {
        Source source=new Source();
        Wrapper wrapper=new Wrapper(source);
        wrapper.supplyPower();
        wrapper.transfor();

    }
}
