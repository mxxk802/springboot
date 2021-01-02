package com.mxxk.putong;

import java.io.File;
import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;

/**
 * SeparatorDemo
 *
 * @auther zhang
 * @date 2020/11/29
 **/
public class SeparatorDemo {

    public static void main(String[] args){

        String testStr = "C:\\windows\\User\\holdlg\\download";
        String love="D:\\myjava\\love.txt" ;
        String webpath=new File("").getAbsolutePath();
        try {
            webpath=URLDecoder.decode(webpath,"utf-8");
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
        System.out.println(webpath);


        System.out.println(testStr);
    }
}
