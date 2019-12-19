package com.ch_du.javatest.string;

import org.testng.annotations.Test;

import java.beans.Transient;

public class TestStringFind {
    @Test
    public  void Test(){
        String str ="hhgfdjasgdaskgdjasgdgasjgdjasgfjkdyyuuewuuew";
        String str2= str.replaceAll("d","D");
        System.out.println(str2);
        str.indexOf("d");
        int count = 0;
        char c1 ='d';
        char[] c =  str.toCharArray();
        for(int i = 0; i<c.length-1; i++){
            if(c1==c[i]){
                count++;
                System.out.println("第"+count+"次出现"+i+"的位置");
            }
        }
        System.out.println("+++++++"+str.indexOf("h"));
        System.out.println("+++++++"+str);
    }

    @Test
    public void TestOpt(){
        String str1 = "hello" + " world" + "!";
        System.out.println(str1);
        StringBuffer strB1 = new StringBuffer();
        strB1.append("hello");
        strB1.append(" world");
        strB1.append("!");
        System.out.println(strB1.toString());
        StringBuilder strB2 = new StringBuilder();
        strB2.append("hello");
        strB2.append(" world");
        strB2.append("!");
        System.out.println(strB2.toString());
        System.out.println("strB2 length is " + strB2.length());
        strB2.setLength(strB2.length() - 1);
        System.out.println(strB2.toString());
        strB2.setLength(strB2.length() + 10);
        System.out.println(strB2.toString());
    }


    @Test
    public  void TestOpt2(){
        String str1 = "hello";
        StringBuilder str2 = new StringBuilder();
        str2.append(str1);
        str2.append(", world!");
        System.out.println(str2.toString());
        long start = System.currentTimeMillis();
        String str = "";
        for (int i = 0; i < 50000; i++) {
            str += i;
        }
        System.out.println(str.length());
        System.out.println("耗时：" + (System.currentTimeMillis() - start) + "ms");
    }

    @Test
    public  void TestOpt3(){
        StringBuilder str2 = new StringBuilder();
        System.out.println(str2.toString());
        long start = System.currentTimeMillis();
        String str = "";
        for (int i = 0; i < 50000; i++) {
            str += i;
        }
        System.out.println(str.length());
        System.out.println("耗时：" + (System.currentTimeMillis() - start) + "ms");
    }
}
