package com.mxxk.designPattern.single;

/**
 * SingletonSample
 *
 * @auther zhang
 * @date 2020/11/30
 **/
public class SingletonSample {

    private static SingletonSample instance = null;//懒汉式单例

    private SingletonSample() {
    }

    public static SingletonSample getInstance() {
        if(instance == null) {
            instance = new SingletonSample();
        }
        return instance;
    }
}
