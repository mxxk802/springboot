package com.mxxk.designPattern.template;

/**
 * Dog
 *
 * @auther zhang
 * @date 2020/12/1
 **/
public class Dog extends Animal {

    public void makeSound(){
        //bark!
        System.out.println("汪汪汪");
    }

    public void eatFood(){
        //eat dog food
        System.out.println("喜欢吃骨头");
    }

    public void sleep(){
        //sleep a lot!
        System.out.println("趴着睡");
    }
}
