package com.ch_du.javatest;

import org.junit.Test;

import java.util.Random;

public class TestdoWhile {
    @Test
    public void Test(){
        boolean c=true;
        do{
            int r = new Random().nextInt(1000);
            if (r % 30 == 0) {
                System.out.println("随机数：" + r + "能被30整除，不在执⾏循环");
                c = false;
            } else {
                System.out.println("随机数：" + r);
            }

        }while(c);
    }
}
