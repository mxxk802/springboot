package com.mxxk.designPattern.proxy;

/**
 * Tenant
 *
 * @auther zhang
 * @date 2020/12/8
 **/
public class Tenant implements FindHouse{
    public void rentHouse(){

        System.out.println("租客要租房子");
    };
}
