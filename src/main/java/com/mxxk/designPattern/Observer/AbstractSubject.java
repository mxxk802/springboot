package com.mxxk.designPattern.Observer;

import java.util.Enumeration;
import java.util.Vector;

/**
 * AbstractSubject
 *
 * @auther zhang
 * @date 2020/12/12
 **/
public abstract class AbstractSubject implements Subject{

    private Vector<Observer> vector=new Vector<>();

    @Override
    public void add(Observer observer) {
        vector.add(observer);
    }

    @Override
    public void del(Observer observer) {
        vector.remove(observer);
    }

    @Override
    public void notifyObservers() {
        Enumeration<Observer> enums=vector.elements();
        while(enums.hasMoreElements()){
            enums.nextElement().update();
        }
    }


}
