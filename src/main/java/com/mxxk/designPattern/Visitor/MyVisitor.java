package com.mxxk.designPattern.Visitor;

/**
 * MyVisitor
 *
 * @auther zhang
 * @date 2020/12/14
 **/
public class MyVisitor implements Visitor{

    @Override
    public void visit(Subject sub) {
        System.out.println("visit the subject："+sub.getSubject());
    }
}
