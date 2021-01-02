package com.mxxk.designPattern.abstractFactory.abstractFactory2;

/**
 * QQSender
 *
 * @auther zhang
 * @date 2020/12/2
 **/
public class QQSender implements Sender {
    @Override
    public void send() {
        System.out.println("qq发送信息");
    }
}
