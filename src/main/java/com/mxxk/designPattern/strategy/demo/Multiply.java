package com.mxxk.designPattern.strategy.demo;

/**
 * Multiply
 *
 * @auther zhang
 * @date 2020/12/12
 **/
public class Multiply extends AbstractCalculator implements ICalculator {

    @Override
    public int calculate(String exp) {
        int array[]=split(exp,"*");
        return array[0]*array[1];

    }
}
