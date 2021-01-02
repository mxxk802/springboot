package com.mxxk.designPattern.template;

/**
 * Cat
 *
 * @auther zhang
 * @date 2020/12/1
 **/
public class Cat extends Animal {
    public void makeSound(){
        //meow!
        System.out.println("喵喵喵");
    }

    public void eatFood(){
        //eat cat food
        System.out.println("喜欢鱼");
    }

    public void sleep(){
        //sleep just a little bit
        System.out.println("去床上");
    }


}
