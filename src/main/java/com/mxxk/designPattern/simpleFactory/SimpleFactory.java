package com.mxxk.designPattern.simpleFactory;

/**
 * SimpleFactory
 *
 * @auther zhang
 * @date 2020/11/30
 **/
public class SimpleFactory {

    public static Eat getDetailObject(String str){

        String name="简单工厂";
        Eat eat=null;
        if("dog".equals(str)){
            eat=new Dog();
            System.out.println(name+"-创建dog对象*****");
        }

        if("pig".equals(str)){
            eat=new Pig();
            System.out.println(name+"*****-创建pig对象*****");
        }

        if("cat".equals(str)){
            eat=new Cat();
            System.out.println(name+"-创建cat对象*****");
        }
        return eat;
    }

    public  void show(){};


}
