package com.mxxk.designPattern.simpleFactory;

import com.mxxk.designPattern.simpleFactory.SimpleFactory;

/**
 * Pig
 *
 * @auther zhang
 * @date 2020/11/30
 **/
public class Pig implements Eat {

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
    public String toString() {
        return "Pig{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    @Override
    public void food() {
        System.out.println("猪吃草");
    }
}
