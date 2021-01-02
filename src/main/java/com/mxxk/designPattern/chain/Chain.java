package com.mxxk.designPattern.chain;

import java.util.Arrays;
import java.util.List;

/**
 * Chain
 *
 * @auther zhang
 * @date 2020/12/1
 **/
public class Chain {
    public List<Command> commands;

    public Chain(Command... commands){
        this.commands = Arrays.asList(commands);
    }

    public void start(Object context){
        for(Command command : commands){
            boolean shouldStop = command.execute(context);

            if(shouldStop){
                return;
            }
        }
    }
}
