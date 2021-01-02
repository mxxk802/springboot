package com.mxxk.designPattern.abstractFactory.abstractFactory2;

/**
 * MailReceiver
 *
 * @auther zhang
 * @date 2020/12/2
 **/
public class MailReceiver implements Receiver {

    @Override
    public void recevie() {
        System.out.println("邮件接收");
    }
}
