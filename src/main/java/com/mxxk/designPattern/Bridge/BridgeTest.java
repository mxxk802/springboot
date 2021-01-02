package com.mxxk.designPattern.Bridge;

/**
 * BridgeTest
 *
 * @auther zhang
 * @date 2020/12/8
 **/
public class BridgeTest {

    public static void main(String[] args) {
        Bridge bridge=new MyBridge();

         /*调用第一个对象*/

        Sourceable s1=new SourceSub1();
        bridge.setSource(s1);
        bridge.method();

         /*调用第二个对象*/
         Sourceable s2=new SourceSub2();
        bridge.setSource(s2);
        bridge.method();

    }
}
