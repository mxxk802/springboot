package com.mxxk.designPattern.Visitor;

/**
 * Test
 *
 * @auther zhang
 * @date 2020/12/14
 **/
public class Test {

    public static void main(String[] args) {
        Visitor visitor=new MyVisitor();

        Subject sub=new MySubject();

        sub.accept(visitor);

    }

}
