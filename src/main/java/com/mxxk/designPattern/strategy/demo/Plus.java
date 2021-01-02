package com.mxxk.designPattern.strategy.demo;

/**
 * Plus
 *
 * @auther zhang
 * @date 2020/12/12
 **/
public class Plus extends AbstractCalculator implements ICalculator {

    @Override
    public int calculate(String exp) {

        int arrayInt[] = split(exp,"\\+");

        return arrayInt[0]+arrayInt[1];
    }
}
