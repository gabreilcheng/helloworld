package com.cheng.test;

import java.util.ArrayList;

public class person {

    private static final  person instance = null;

    public static void main(String[] args) {

        System.out.println("真的好用");
        person p = new person();
        p.test(10);

    }

    public void test(int a ){
        int num = 666;
        System.out.println("a = [" + a + "]");
        System.out.println("person.test");
        System.out.println("num = " + num);
        String[] strs  = new String[]{"lisi","zhangsan"};
        // itar
        for (int i = 0; i < strs.length; i++) {
            String str = strs[i];
            System.out.println(str);
        }
        //iter
        for (String str : strs) {
            System.out.println(str);
        }

        //region Description
        ArrayList<Integer> arrayList = new ArrayList();
        //arrayList.for
        for (Integer integer : arrayList) {

        }
        //arrayList.fori
        for (int i = 0; i < arrayList.size(); i++) {

        };
        //arrayList.forr
        for (int i = arrayList.size() - 1; i >= 0; i--) {
            
        }
        //endregion

        //ifn
        if (arrayList == null) {

        }
        //inn
        if (arrayList != null) {
            
        }





    }

}
