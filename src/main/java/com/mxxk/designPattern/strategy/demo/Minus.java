package com.mxxk.designPattern.strategy.demo;

/**
 * Minus
 *
 * @auther zhang
 * @date 2020/12/12
 **/
public class Minus extends AbstractCalculator implements ICalculator {
    @Override
    public int calculate(String exp) {

        int array[]=split(exp,"-");
        return array[0]-array[1];
    }
}
