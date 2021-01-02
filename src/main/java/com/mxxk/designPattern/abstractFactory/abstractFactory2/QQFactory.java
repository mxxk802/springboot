package com.mxxk.designPattern.abstractFactory.abstractFactory2;

/**
 * QQFactory
 *
 * @auther zhang
 * @date 2020/12/2
 **/
public class QQFactory implements Provider{

    @Override
    public Sender getSender() {
        return new QQSender();
    }

    @Override
    public Receiver getRecever() {
        return new QQReceiver();
    }
}
