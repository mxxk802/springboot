package com.mxxk.designPattern.Command;

/**
 * MyCommand
 *
 * @auther zhang
 * @date 2020/12/14
 **/
public class MyCommand implements Command {

    private Receiver receiver;

    public MyCommand(Receiver receiver) {
        this.receiver = receiver;
    }

    @Override
    public void exe() {
        receiver.action();
    }
}
