package com.mxxk.designPattern.single;

/**
 * Singleton
 *
 * @auther zhang
 * @date 2020/11/30
 **/
public class Singleton {

    /**
     * 构造方法私有是防止从外部构造对象
     */
    private Singleton() {
    }

    private static Singleton singleton=new Singleton();//饿汉式初始化

    public static Singleton getSingleton(){
        return singleton;
    }
}
