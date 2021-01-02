package com.mxxk.designPattern.Interpreter;

/**
 * Plus
 *
 * @auther zhang
 * @date 2020/12/15
 **/
public class Plus implements Expression {

    @Override
    public int interpret(Context context) {
        return context.getNum1()+context.getNum2();
    }
}
