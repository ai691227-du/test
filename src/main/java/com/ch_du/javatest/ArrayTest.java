package com.ch_du.javatest;

import java.util.Scanner;

public class ArrayTest {
    public static void main(String args){
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();
        if (age<0){
            System.out.println("请重新输入");
        }
        else if (age>0&&age<=12){
            System.out.println("青少年");
        }
        else if (age>=13&&age<=22){
            System.out.println("少年");
        }
        else if (age>=23&&age<=45){
            System.out.println("中年");
        }
        else if (age>=46&&age<=55){
            System.out.println("中老年");
        }
        else if (age>=56&&age<=99){
            System.out.println("老年");
        }else{
            System.out.println("百岁老人");
        }
    }
}
