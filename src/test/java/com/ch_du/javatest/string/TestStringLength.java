package com.ch_du.javatest.string;

import org.junit.Test;

public class TestStringLength {
    @Test
    public void Test(){
       String str = "hello,\\uD835\\uDD5D\\uD835\\uDD60\\uD835\\uDD60\\uD835\\uDD5C";
       str.length();
       System.out.println("长度："+str.length());
       str.codePointCount(0,str.length());
       System.out.println("长度："+str.codePointCount(0,str.length()));
       String str2 = str.substring(5,10);
       System.out.println("长度："+str2);

       System.out.println("以"+str.startsWith("1")+"开始");
       System.out.println("以"+str.startsWith("1")+"结束");

    }

}
