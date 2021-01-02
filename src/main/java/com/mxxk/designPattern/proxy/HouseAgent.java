package com.mxxk.designPattern.proxy;

/**
 * HouseAgent
 *
 * @auther zhang
 * @date 2020/12/8
 **/
public class HouseAgent implements FindHouse{


    private Tenant tenant;

    public HouseAgent() {
        this.tenant = new Tenant();
    }

    @Override
    public void rentHouse() {
        before();
        System.out.println("我是房屋中介，我要帮租户找房子");
        atfer();
    }

    private void atfer() {
        System.out.println("after proxy!");
    }
    private void before() {
        System.out.println("before proxy!");
    }
}
