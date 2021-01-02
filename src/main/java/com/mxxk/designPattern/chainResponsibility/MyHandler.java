package com.mxxk.designPattern.chainResponsibility;

/**
 * MyHandler
 *
 * @auther zhang
 * @date 2020/12/13
 **/
public class MyHandler extends AbstractHandle implements Handle {

    private  String name;

    public MyHandler(String name) {
        this.name = name;
    }

    @Override
    public void operator() {
        System.out.println(this.name+"------deal");
        if(getHandle()!=null){
             getHandle().operator();
        }
    }
}
