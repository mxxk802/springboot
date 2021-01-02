package com.mxxk.designPattern.abstractFactory.abstractFactory3;

/**
 * RedShapeFactory
 *
 * @auther zhang
 * @date 2020/12/6
 **/
public class RedShapeFactory implements Provider{

    @Override
    public Shape getCircle() {
        return new RedCircle();
    }

    @Override
    public Shape getTriangle() {
        return new ReTriangle();
    }
}
