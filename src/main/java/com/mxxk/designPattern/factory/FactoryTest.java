package com.mxxk.designPattern.factory;

/**
 * FactoryTest
 *
 * @auther zhang
 * @date 2020/12/3
 **/
public class FactoryTest {

    public static void main(String[] args) {

        FoodFactory factory=new CakeFactory();

        CakeMaker cakeMaker=factory.getInstance();
        cakeMaker.produce();
    }
}
