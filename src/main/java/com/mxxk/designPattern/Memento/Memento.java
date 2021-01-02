package com.mxxk.designPattern.Memento;

/**
 * Memento
 *
 * @auther zhang
 * @date 2020/12/14
 **/
public class Memento {

    private String value;

    public Memento(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }
}
