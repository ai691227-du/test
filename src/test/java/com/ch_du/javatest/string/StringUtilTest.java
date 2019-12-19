package com.ch_du.javatest.string;

import org.junit.Test;

public class StringUtilTest {
//去掉字符串开头/结尾/中间的空格（不使⽤ trim ⽅法）
    @Test
    public void Test(){
        String str = "jdsakdaskldkaskfhk hakshdkasda a kksdhkl klhdj asd h hs";
       System.out.println(str.length());
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i<str.length();i++){
            char c =str.charAt(i);
            if(c == ' '){
                continue;

            }
            sb.append(c);
        }

        System.out.println("--------" +sb+sb.length());
    }
}
