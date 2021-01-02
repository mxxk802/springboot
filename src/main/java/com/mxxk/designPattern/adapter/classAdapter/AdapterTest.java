package com.mxxk.designPattern.adapter.classAdapter;

/**
 * AdapterTest
 *
 * @auther zhang
 * @date 2020/12/6
 **/
public class AdapterTest {

    public static void main(String[] args) {
        Targetable target=new Adapter();
        target.method1();
        target.method2();
    }
}
