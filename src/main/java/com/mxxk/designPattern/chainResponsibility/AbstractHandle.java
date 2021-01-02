package com.mxxk.designPattern.chainResponsibility;

/**
 * AbstractHandle
 *
 * @auther zhang
 * @date 2020/12/13
 **/
public abstract class AbstractHandle {

    private Handle handle;

    public Handle getHandle() {
        return handle;
    }

    public void setHandle(Handle handle) {
        this.handle = handle;
    }


}
