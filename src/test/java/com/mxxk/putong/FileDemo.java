package com.mxxk.putong;



import com.mxxk.utils.PathUtils;

import java.io.*;

/**
 * FileDemo
 *
 * @auther zhang
 * @date 2020/10/23
 **/
public class FileDemo { 

    public static void main(String[] args) throws IOException {

        File file=new File("D:\\myjava\\stu.txt");
        File file1=new File("D:\\myjava\\","stu1.txt");
        if(file1.exists()){
            System.out.println("文件存在");
        }
        System.out.println("xiangsi");

        String fileNames[]=fileNames(new File("D:\\"));

        for(String s:fileNames){
            System.out.println(s);
        }

        System.out.println("******************");

        File myjava=new File("D:\\myjava");

        String myjavaFiles[]=myjava.list(new FilenameFilter() {
            @Override
            public boolean accept(File dir, String name) {

                //System.out.println("dir----"+dir+"---------name"+name);
                File fils=new File(dir,name);

                boolean isFile=fils.isFile();
                boolean containtxt=name.endsWith(".txt");
                return isFile && containtxt;
            }
        });
        for(String s:myjavaFiles){
            System.out.println(s);
        }

        FileOutputStream out=new FileOutputStream("wo.txt");

        copyVideo();


    }

    public static String[] fileNames(File file){

        String fs[]=file.list();
        return fs;
    }

    public static void copyVideo() throws IOException {
        String videoPath= PathUtils.downloadPath+"/video/";
        FileInputStream img=new FileInputStream(videoPath+"鹦鹉.jpg");

        FileOutputStream outImg=new FileOutputStream(videoPath+"小鹦鹉.jpg");


        FileInputStream vid=new FileInputStream(videoPath+"RabbitMQ介绍_edit.wmv");
        FileOutputStream vidOut=new FileOutputStream(videoPath+"RabbitMQ.wmv");

        int by=0;

        while((by=img.read())!=-1){

            vidOut.write(by);
        }

        int by1=0;

        while((by1=vid.read())!=-1){

            outImg.write(by);
        }

        img.close();
        outImg.close();
        vid.close();
        vidOut.close();

    }

}
