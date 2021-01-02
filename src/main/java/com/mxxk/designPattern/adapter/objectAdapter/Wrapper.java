package com.mxxk.designPattern.adapter.objectAdapter;

import com.mxxk.designPattern.adapter.demo.Socket;


/**
 * Wrapper
 *
 * @auther zhang
 * @date 2020/12/6
 **/
public class Wrapper implements Targetable{

    private  Source source;

    public Wrapper(Source source) {
        this.source = source;
    }

    @Override
    public void transfor() {
        System.out.println("转化为电脑适配电压20v");
    }

    @Override
    public void supplyPower() {
        source.supplyPower();
    }
}
