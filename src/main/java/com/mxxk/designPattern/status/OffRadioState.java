package com.mxxk.designPattern.status;

/**
 * OffRadioState
 *
 * @auther zhang
 * @date 2020/12/1
 **/
public class OffRadioState implements RadioState {

    @Override
    public void execute(Radio radio) {
        //throws exception if radio is already off
        radio.setOn(false);
        System.out.println("关闭收音机");
    }
}
