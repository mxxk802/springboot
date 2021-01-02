package com.mxxk.designPattern.status;

/**
 * Radio
 *
 * @auther zhang
 * @date 2020/12/1
 **/
public class Radio {

    private boolean on;
    private RadioState state;

    public Radio(RadioState state) {
        this.state = state;
    }

    public void execute(){
        state.execute(this);
    }

    public boolean isOn() {
        return on;
    }

    public void setOn(boolean on) {
        this.on = on;
    }

    public boolean isOff(){
        return !on;
    }

    public RadioState getState() {
        return state;
    }

    public void setState(RadioState state) {
        this.state = state;
    }
}
