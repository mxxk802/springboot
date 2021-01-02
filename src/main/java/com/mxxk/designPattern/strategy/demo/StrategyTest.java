package com.mxxk.designPattern.strategy.demo;

/**
 * StrategyTest
 *
 * @auther zhang
 * @date 2020/12/12
 **/
public class StrategyTest {

    public static void main(String[] args) {
        ICalculator cal=new Minus();
        int a=cal.calculate("2-8");
        System.out.println(a);
    }
}
