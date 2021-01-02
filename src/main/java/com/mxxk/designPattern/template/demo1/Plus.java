package com.mxxk.designPattern.template.demo1;

/**
 * Plus
 *
 * @auther zhang
 * @date 2020/12/12
 **/
public class Plus extends AbstractCalculator {

    @Override
    public int calculate(int num1, int num2) {
        return num1+num2;
    }
}
