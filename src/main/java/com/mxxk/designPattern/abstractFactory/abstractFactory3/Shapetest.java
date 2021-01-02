package com.mxxk.designPattern.abstractFactory.abstractFactory3;

/**
 * Shapetest
 *
 * @auther zhang
 * @date 2020/12/6
 **/
public class Shapetest {

    public static void main(String[] args) {
        Provider redShape=new RedShapeFactory();
        Shape redCircle=redShape.getCircle();
        Shape redTriangle=redShape.getTriangle();
        redCircle.draw();
        redTriangle.draw();
    }
}
