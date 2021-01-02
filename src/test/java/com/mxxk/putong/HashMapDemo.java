package com.mxxk.putong;

import java.util.*;

/**
 * HashMapDemo
 *
 * @auther zhang
 * @date 2020/10/9
 **/
public class HashMapDemo {


    public static void main(String[] args) throws Exception{

        Map map= new HashMap();

        map.put("data",123);
        map.put("data",123);

       Set s=map.keySet();
       Iterator<String> it=map.keySet().iterator();
        while(it.hasNext()){
            String key=it.next();
            System.out.println(map.get(key));
        }

        Map<Student,String> stuMap=new HashMap<Student,String>();
        Student s1=new Student("张三",18);

        Student s2=new Student("李四",20);
        Student s3=new Student("张三",18);

        stuMap.put(s1,"001");
        stuMap.put(s2,"002");
        stuMap.put(s3,"003");


//        Iterator<Student> stuMap1=map.keySet().iterator();
//        while(stuMap1.hasNext()){
//            Student sa=(Student)stuMap1.next();
//            System.out.println(sa.getName()+"--"+sa.getAge());
//        }
        Set<Student> stuo=map.keySet();
        Iterator<Student> iterator = stuo.iterator();
        while (iterator.hasNext()) {
            Student key = iterator.next();
            System.out.println(key);
            System.out.println(map.get(key));
        }

        for(Map.Entry<Student,String> entry : stuMap.entrySet()){
            System.out.println("key = " + entry.getKey() + ", value = " + entry.getValue());
        }


        for(Student stu:stuMap.keySet()){
            System.out.println(stu.getName()+"--"+stu.getAge());
        }

    }
}
