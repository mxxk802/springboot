package com.mxxk.designPattern.adapter.interfaceAdapter;

import com.mxxk.designPattern.adapter.objectAdapter.Wrapper;

/**
 * SourceSub1
 *
 * @auther zhang
 * @date 2020/12/6
 **/
public class SourceSub1 extends Wrapper2 {

    @Override
    public void method1() {
        System.out.println("the sourceable interface's first Sub1");
    }
}
