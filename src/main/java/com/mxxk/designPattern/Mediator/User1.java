package com.mxxk.designPattern.Mediator;

/**
 * User1
 *
 * @auther zhang
 * @date 2020/12/15
 **/
public class User1 extends User {

    public User1(Mediator mediator){
        super(mediator);
    }

    @Override
    public void work() {
        System.out.println("user1 exe!");
    }
}
