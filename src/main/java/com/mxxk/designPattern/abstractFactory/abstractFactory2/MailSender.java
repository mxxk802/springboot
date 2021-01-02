package com.mxxk.designPattern.abstractFactory.abstractFactory2;

/**
 * MailSender
 *
 * @auther zhang
 * @date 2020/12/2
 **/
public class MailSender implements Sender {

    @Override
    public void send() {
        System.out.println("邮件发送信息！");
    }
}
