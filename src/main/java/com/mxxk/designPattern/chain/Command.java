package com.mxxk.designPattern.chain;

public interface Command<T> {

    boolean execute(T context);
}
