package com.mxxk.designPattern.Mediator;

/**
 * User
 *
 * @auther zhang
 * @date 2020/12/15
 **/
public abstract class User {

    private Mediator mediator;

    public Mediator getMediator(){
        return mediator;
    }

    public User(Mediator mediator) {
        this.mediator = mediator;
    }

    public abstract void work();


}
