package com.mxxk.putong;

import java.io.*;
import java.util.Arrays;

/**
 * IoDemo
 *
 * @auther zhang
 * @date 2020/11/4
 **/
public class IoDemo {

    public static void main(String[] args) throws Exception{


        method1();
        writeByWriter();

    }
    public static void method1() throws Exception{
        String miyao="李四";

        byte a[]=miyao.getBytes("GBK");

        System.out.println(Arrays.toString(a));

        System.out.println("-------------------");

        String jiema=new String(a,"GBK");

        System.out.println(jiema);
        writeDoc();
    }
    public static void writeDoc() throws IOException {
        File file=new File("love.txt");
        //FileInputStream fin=new FileInputStream(file);

        FileOutputStream fout=new FileOutputStream(file);
        fout.write("中国".getBytes("UTF-8"));
        fout.write("我爱你".getBytes("UTF-8"));
        fout.close();
    }
    public static void writeByWriter() throws Exception{

        OutputStreamWriter writer=new OutputStreamWriter(new FileOutputStream("writer.txt"));

        writer.write(97);
        writer.write('A');
       writer.flush();
    }
}
