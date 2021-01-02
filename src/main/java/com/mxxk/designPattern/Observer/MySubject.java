package com.mxxk.designPattern.Observer;

/**
 * MySubject
 *
 * @auther zhang
 * @date 2020/12/12
 **/
public class MySubject extends AbstractSubject {

    @Override
    public void operation() {
        System.out.println("update self!");
        notifyObservers();
    }
}
