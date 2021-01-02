package com.mxxk.designPattern.Command;

/**
 * Invoker
 *
 * @auther zhang
 * @date 2020/12/14
 **/
public class Invoker {

    private Command command;

    public Invoker(Command command) {
        this.command = command;
    }

    public void action(){
        command.exe();
    }
}
