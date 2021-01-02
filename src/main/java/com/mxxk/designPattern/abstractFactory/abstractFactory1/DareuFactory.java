package com.mxxk.designPattern.abstractFactory.abstractFactory1;

/**
 * DareuFactory
 *
 * @auther zhang
 * @date 2020/12/2
 **/
public class DareuFactory implements DeciveFactory{

    @Override
    public Usb getKeyBoard() {
        return new DareuKeyBoard();//创建达尔优键盘
    }

    @Override
    public Usb getMouse() {
        return new DareuMouse();//创建达尔优鼠标
    }
}
