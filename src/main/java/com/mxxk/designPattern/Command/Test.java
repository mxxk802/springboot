package com.mxxk.designPattern.Command;

/**
 * Test
 *
 * @auther zhang
 * @date 2020/12/14
 **/
public class Test {

    public static void main(String[] args) {

        Receiver receiver=new Receiver();

        MyCommand myCommand=new MyCommand(receiver);

        Invoker invoker=new Invoker(myCommand);

        invoker.action();

    }
}
