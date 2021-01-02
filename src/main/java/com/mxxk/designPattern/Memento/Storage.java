package com.mxxk.designPattern.Memento;

/**
 * Storage
 *
 * @auther zhang
 * @date 2020/12/14
 **/
public class Storage {

    private Memento memento;

    public Storage(Memento memento) {
        this.memento = memento;
    }

    public Memento getMemento() {
        return memento;
    }

    public void setMemento(Memento memento) {
        this.memento = memento;
    }
}
