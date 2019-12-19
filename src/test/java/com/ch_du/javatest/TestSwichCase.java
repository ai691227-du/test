package com.ch_du.javatest;

import org.testng.annotations.Test;

import java.util.Scanner;

public class TestSwichCase {

    @Test
    public void Test(){
        System.out.println("请输入1-5");
      Scanner sc = new Scanner(System.in);
      int cmdN = sc.nextInt();

        switch (cmdN) {
            case 1:
                System.out.println("扫地");
                break;
            case 2:
                System.out.println("开灯");
                break;
            case 3:
                System.out.println("关灯");
                break;
            case 4:
                System.out.println("播放⾳乐");
                break;
            case 5:
                System.out.println("关闭⾳乐");
                break;
            default:
                System.out.println("不能识别的指令");
        }

    }
}
