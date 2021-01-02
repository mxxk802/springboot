package com.mxxk.designPattern;

import com.mxxk.designPattern.abstractFactory.abstractFactory1.DareuFactory;
import com.mxxk.designPattern.abstractFactory.abstractFactory1.DeciveFactory;
import com.mxxk.designPattern.abstractFactory.abstractFactory1.Usb;
import com.mxxk.designPattern.abstractFactory.abstractFactory2.Provider;
import com.mxxk.designPattern.abstractFactory.abstractFactory2.QQFactory;
import com.mxxk.designPattern.abstractFactory.abstractFactory2.Receiver;
import com.mxxk.designPattern.abstractFactory.abstractFactory2.Sender;
import com.mxxk.designPattern.builder.Product;
import com.mxxk.designPattern.chain.Chain;
import com.mxxk.designPattern.chain.FirstCommand;
import com.mxxk.designPattern.chain.SecondCommand;
import com.mxxk.designPattern.factory.CakeFactory;
import com.mxxk.designPattern.factory.CakeMaker;
import com.mxxk.designPattern.factory.FoodFactory;
import com.mxxk.designPattern.simpleFactory.Eat;
import com.mxxk.designPattern.simpleFactory.SimpleFactory;
import com.mxxk.designPattern.single.Singleton;
import com.mxxk.designPattern.single.SingletonSample;
import com.mxxk.designPattern.status.OffRadioState;
import com.mxxk.designPattern.status.OnRadioState;
import com.mxxk.designPattern.status.Radio;
import com.mxxk.designPattern.strategy.demo2.Building;
import com.mxxk.designPattern.strategy.demo2.BuildingFactory;

import java.util.HashMap;
import java.util.Map;

/**
 * Test
 *
 * @auther zhang
 * @date 2020/11/30
 **/
public class Test {

    public static void main(String[] args) {

        Singleton s1 = Singleton.getSingleton();
        Singleton s2 = Singleton.getSingleton();

        System.out.println("_____________________饿汉式单例模式----------------------");
        System.out.println(s1 == s2);
        System.out.println(s1);


        SingletonSample f1 = SingletonSample.getInstance();
        SingletonSample f2 = SingletonSample.getInstance();

        System.out.println("_____________________饱汉式单例模式----------------------");
        System.out.println(f1 == f2);
        System.out.println(f1);


        System.out.println("_____________________简单工厂模式模式----------------------");
        Eat sim1 = SimpleFactory.getDetailObject("pig");
        sim1.food();

        System.out.println("_____________________工厂模式模式----------------------");
        FoodFactory foodFactory=new CakeFactory();
        CakeMaker cakeProduce=foodFactory.getInstance();
        cakeProduce.produce();

        System.out.println("_____________________策略模式----------------------");
        Building build = BuildingFactory.getBuilding("house");
        System.out.println(build.getType());

        System.out.println("_____________________建造者模式----------------------");

        Product product = Product.newProduct()
                .id("001")
                .description("TV 46'")
                .value(2000.00)
                .name("TV 46'")
                .build();
        System.out.println(product.toString());

        System.out.println("_____________________模板模式----------------------");
        com.mxxk.designPattern.template.Animal tem = new com.mxxk.designPattern.template.Dog();
        tem.doEveryday();


        System.out.println("_____________________状态模式----------------------");
        Radio radio = new Radio(new OffRadioState()); //initial status
        radio.setState(new OnRadioState());
        radio.execute(); //radio on
        radio.setState(new OffRadioState());
        radio.execute(); //radio off

        System.out.println("_____________________链式模式----------------------");
        FirstCommand fc1=new FirstCommand();
        SecondCommand sc1=new SecondCommand();

        Chain chain=new Chain(fc1,sc1);
        Map<String, Object> map=new HashMap<>();
        map.put("one","hello");
        chain.start(map);

        System.out.println("_____________________抽象工厂模式----------------------");

        Provider provider=new QQFactory();
        Sender sender=provider.getSender();
        Receiver receiver=provider.getRecever();
        sender.send();
        receiver.recevie();
        System.out.println("_____________________抽象工厂模式2----------------------");

        DeciveFactory deciveFactory=new DareuFactory();
        Usb key= deciveFactory.getKeyBoard();
        Usb mouse=deciveFactory.getMouse();
        key.operate();
        mouse.operate();

    }
}
