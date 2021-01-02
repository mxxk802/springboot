package com.mxxk.designPattern.factory;

/**
 * CakeFactory
 *
 * @auther zhang
 * @date 2020/12/2
 **/
public class CakeFactory implements FoodFactory{


    @Override
    public CakeMaker getInstance() {
        return new Cookies();
    }
}
