package com.mxxk.designPattern.template;

/**
 * Animal
 *
 * @auther zhang
 * @date 2020/12/1
 **/
public abstract class Animal {
    public abstract void makeSound();
    public abstract void eatFood();
    public abstract void sleep();

    public void doEveryday(){
        makeSound();
        eatFood();
        sleep();
    }
}
