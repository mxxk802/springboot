package com.mxxk.designPattern.Visitor;

/**
 * MySubject
 *
 * @auther zhang
 * @date 2020/12/14
 **/
public class MySubject implements Subject {

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    @Override
    public String getSubject() {
        return "love";
    }
}
