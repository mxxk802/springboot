package com.mxxk.designPattern.factory;

/**
 * Cookies
 *
 * @auther zhang
 * @date 2020/12/2
 **/
public class Cookies implements CakeMaker {

    @Override
    public void produce() {
        for(int i=0;i<50;i++){
            System.out.println("生产曲奇饼干第"+i+"份曲奇饼干");
        }
    }
}
