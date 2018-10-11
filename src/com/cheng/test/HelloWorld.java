package com.cheng.test;

import java.util.ArrayList;
import java.util.Date;

public class HelloWorld {
    public  String name;
    private static int a;

    //这是注释
    public static void main(String[] args) {
        System.out.print("hello");
        ArrayList list = new ArrayList();
        hell();
        Date date = new Date();
        System.out.print(date);

    }


    public static void hell()  {
        a = 10;
        System.out.println("大家好，我 " +a+" 岁");
//        try {
//            FileInputStream input = new FileInputStream("");
//        } catch (FileNotFoundException e) {
//            e.printStackTrace();
//        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
