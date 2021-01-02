package com.mxxk.designPattern.simpleFactory;

import com.mxxk.designPattern.simpleFactory.SimpleFactory;

/**
 * Cat
 *
 * @auther zhang
 * @date 2020/11/30
 **/
public class Cat implements Eat{
    private String name;
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public void food() {
        System.out.println("猫吃鱼");
    }

    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
