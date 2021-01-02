package com.mxxk.designPattern.abstractFactory.abstractFactory2;

/**
 * QQReceiver
 *
 * @auther zhang
 * @date 2020/12/2
 **/
public class QQReceiver implements Receiver{
    @Override
    public void recevie() {
        System.out.println("qq接收信息");
    }
}
