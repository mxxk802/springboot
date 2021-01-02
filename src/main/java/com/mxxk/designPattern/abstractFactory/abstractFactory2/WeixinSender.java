package com.mxxk.designPattern.abstractFactory.abstractFactory2;

/**
 * WeixinSender
 *
 * @auther zhang
 * @date 2020/12/2
 **/
public class WeixinSender implements Sender{

    @Override
    public void send() {
        System.out.println("微信发送信息");
    }
}
