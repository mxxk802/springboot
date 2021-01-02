package com.mxxk.designPattern.Interpreter;

/**
 * Minus
 *
 * @auther zhang
 * @date 2020/12/15
 **/
public class Minus implements Expression {

    @Override
    public int interpret(Context context) {
        return context.getNum1()-context.getNum2();
    }
}
