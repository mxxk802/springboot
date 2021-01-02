package com.mxxk.putong;

import java.beans.SimpleBeanInfo;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * ExceptionDemo
 *
 * @auther zhang
 * @date 2020/10/22
 **/
public class ExceptionDemo {


    public static void main(String[] args) {

        int a=10;
        int b=0;



        System.out.println("-----------");

        String date="2020-10-22";

        //SimpleDateFormat format=new SimpleDateFormat("yyyy-MM-dd HH:ss:mm");
        SimpleDateFormat format=new SimpleDateFormat("yyyy-MM-dd");

        try {
            //System.out.println(a/b);
            Date today=format.parse(date);
        } catch (ParseException e) {
            e.printStackTrace();
        }catch (ArithmeticException e){
            e.printStackTrace();
        }

        System.out.println("******************");

    }
}
