package com.mxxk.designPattern.Observer;

/**
 * ObserverTest
 *
 * @auther zhang
 * @date 2020/12/12
 **/
public class ObserverTest {

    public static void main(String[] args) {
        Subject subject=new MySubject();

        subject.add(new Observer1());
        subject.add(new Observer2());

        subject.operation();
    }
}
