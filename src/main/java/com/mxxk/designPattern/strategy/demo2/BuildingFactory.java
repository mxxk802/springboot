package com.mxxk.designPattern.strategy.demo2;

import java.util.HashMap;
import java.util.Map;

/**
 * BuildingFactory
 *
 * @auther zhang
 * @date 2020/11/30
 **/
public class BuildingFactory {

    private static Map<String,Building> instance;

    static {
        instance=new HashMap<>();
        instance.put("house",new House());
        instance.put("edifice",new Edifice());
    }

    public static <T extends Building> T getBuilding(String type){
        return (T)instance.get(type);
    }
}
