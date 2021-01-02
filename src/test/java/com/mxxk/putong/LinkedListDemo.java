package com.mxxk.putong;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;

/**
 * LinkedListDemo
 *
 * @auther zhang
 * @date 2020/10/9
 **/
public class LinkedListDemo {

    public static void main(String[] args) {


        LinkedList list=new LinkedList();

        list.add("hello");
        list.add("java");
        list.add("world");
        list.add("c++");
        list.add("java");
        list.add("androd");

        Iterator it=list.iterator();
        while(it.hasNext()){
            String key=it.next().toString();
            System.out.println(key);
        }

        for(int i=0;i<list.size()-1;i++){

            for(int j=i+1;j<list.size();j++){

                if(list.get(i).equals(list.get(j))){
                    list.remove(j);
                }
            }
        }
        System.out.println("----------------------------------");
        for(int x=0;x<list.size();x++){
            System.out.println(list.get(x).toString());
        }

    }
}
