package com.mxxk.designPattern.abstractFactory.abstractFactory2;

public interface Provider {

    public abstract Sender getSender();

    public abstract Receiver getRecever();
}
