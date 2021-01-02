package com.mxxk.designPattern.status;

/**
 * OnRadioState
 *
 * @auther zhang
 * @date 2020/12/1
 **/
public class OnRadioState implements RadioState {

    @Override
    public void execute(Radio radio) {
        //throws exception if radio is already on
        radio.setOn(true);
        System.out.println("打开收音机");
    }
}
