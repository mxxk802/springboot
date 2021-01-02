package com.mxxk.putong;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/**
 * HashSetDemo
 *
 * @auther zhang
 * @date 2020/10/9
 **/
public class HashSetDemo {

    public static void main(String[] args) {


        Set<Student> set=new HashSet<>();
        Student s1=new Student("林黛玉",15);
        Student s2=new Student("贾宝玉",16);
        Student s3=new Student("王熙凤",19);
        Student s4=new Student("薛宝钗",17);
        Student s5=new Student("薛宝钗",20);
        set.add(s1);
        set.add(s2);
        set.add(s3);
        set.add(s4);
        set.add(s5);

        Iterator it=set.iterator();
        while(it.hasNext()){
            String key=it.next().toString();
            System.out.println(key);
        }
    }
}
