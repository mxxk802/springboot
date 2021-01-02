package com.mxxk.designPattern.facade;

/**
 * FacadeTest
 *
 * @auther zhang
 * @date 2020/12/8
 **/
public class FacadeTest {

    public static void main(String[] args) {

        Computer computer=new Computer();
        computer.startup();
        computer.shutdown();
    }
}
