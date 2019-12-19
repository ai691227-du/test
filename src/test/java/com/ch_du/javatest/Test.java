package com.ch_du.javatest;

import java.util.Random;

public class Test {
    /**
     *
     */
    @org.junit.Test
    public  void TestWhile(){
        boolean c=true;
        while (c){
            //random 一个小于1000的随机数
            int random = new Random().nextInt(1000);
            if(random%30 ==0){
                System.out.println("随机数：" + random + "能被30整除，不在执⾏循环");
                c=false;
            }else {
                System.out.println("随机数：" + random );
            }
        }
    }
}
