package com.ch_du.javatest;

import org.testng.annotations.Test;

import java.util.Random;

public class TestFor {
    @Test
    public void test(){
        for(int i = 0; i <= 100; i++ ){
            if (i % 30 == 0) {
                System.out.println("随机数：" + i + "能被30整除，不在执⾏循环");

            } else {
                System.out.println("随机数：" + i);
            }
        }
    }
}
