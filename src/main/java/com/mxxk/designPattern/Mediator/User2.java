package com.mxxk.designPattern.Mediator;

/**
 * User1
 *
 * @auther zhang
 * @date 2020/12/15
 **/
public class User2 extends User {

    public User2(Mediator mediator){
        super(mediator);
    }

    @Override
    public void work() {
        System.out.println("user2 exe!");
    }
}
