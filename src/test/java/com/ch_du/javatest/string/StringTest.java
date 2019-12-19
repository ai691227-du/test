package com.ch_du.javatest.string;

import org.junit.Test;

public class StringTest {

    @Test
    public void Test(){
        String str1 = "hello";
        String str2 = "hello";
        //str1=str2  true   他们都是常量池
        System.out.println("str1 = str2, " + (str1 == str2));

        //结果是false  ,str2是变量值
        String str3 = "hello" + "world";
        String str4 = str2 + "world";
        System.out.println("str3 = str4, " + (str3 == str4));

        //false ，str5是通过new出来的，是堆中的
        String str5 = new String("hello");
        System.out.println("str1 = str5, " + (str1 == str5));

        //false， 堆中的地址不一样
        String str6 = new String("hello");
        System.out.println("str5 = str6, " + (str5 == str6));

        //str1是在字符串商量中已经存在的
        //intern()方法会从常量池中虚招，如果没有，在在堆中创建
        //所以结果是 true
        String str7 = str6.intern();
        System.out.println("str1 = str7, " + (str1 == str7));


        String str8 = new String("hello").intern();
        System.out.println("str1 = str8, " + (str1 == str8));

    //false
        String str9 = "hello";
       // str9 += "world";
        str9 = str9+"world";
        System.out.println(str9+"str3 = str9, " + (str3 == str9));
    }
}
