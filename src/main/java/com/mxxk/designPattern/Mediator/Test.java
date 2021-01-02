package com.mxxk.designPattern.Mediator;

/**
 * Test
 *
 * @auther zhang
 * @date 2020/12/15
 **/
public class Test {

    public static void main(String[] args) {

        Mediator mediator=new MyMediator();

        mediator.createMediator();
        mediator.workAll();
    }
}
