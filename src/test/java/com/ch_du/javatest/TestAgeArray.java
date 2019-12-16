package com.ch_du.javatest;

import org.testng.annotations.Test;

import java.util.Arrays;
import java.util.Scanner;

public class TestAgeArray {
    @Test
    public void age(){
        int[] years={};
        int[] age={8,38,103,99,12,22,33,44,55,66,77,88};
        Arrays.sort(age);
        System.out.println(age);
        for (int i = 0; i<age.length;i++){
            if(age[i]<12){
                int j=0;
                j++;
                System.out.println(age[i]+"少年"+"有"+j+"位");
            }
            else if (age[i]>=12&&age[i]<=22){
                System.out.println(age[i]+"青少年");
            }
            else if (age[i]>=22&&age[i]<=40){
                System.out.println(age[i]+"中年");
            }
            else if (age[i]>=41&&age[i]<=55){
                System.out.println(age[i]+"中老年");
            }
            else if (age[i]>=56&&age[i]<=99){
                System.out.println(age[i]+"老年");
            }
            else if (age[i]>99){
                System.out.println(age[i]+"您是老寿星");
            }
        }
    }

    @Test
    public void yaea(){
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
