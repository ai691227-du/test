package com.zeroten.common.util;

public class CheckUtilsTest {

    /**
     *
     * String... strings 为可变参数，你可以认为它是 String[] strings。
     * 如果 strings 中有任
     * 意⼀个字符串为空，则返回 false，否则返回 true。
     */
    public static boolean isAnyEmpty(String... strings){
      for(String str:strings){
          if (str == ""||str == null||str.trim().length()==0){
              System.out.println(str);
              return  true;
          }
      }
        return false;
    }

    /**
     *
     判断引⽤类型数组是否为空，为空或 null 则返回 true，否则返回 false。
     */
    public static boolean isEmpty(Object[] arr){
        for(Object str :arr ){
            if(arr == null || arr.length==0){
                return  true;
            }
        }
        return false;
    }

    /**
     * 判断 str1 字符串是否相等，相等则返回 true，否则返回 false。当其中⼀个是 null
     *  时返回false。
     */
    public static boolean equals(String str1, String str2){
        if (str1 != null&& str2 != null){
            if (str1 == str2){
                return true;
            }else {
                return false;
            }
        }else {
            return false;
        }
    }

    /**
     * 判断 n1 和 n2 的值是否相等，相等则返回 true，
     * 否则返回 false。当其中⼀个是 null 时返回false。
     */
    public static boolean equals(Integer n1, Integer n2){
        if (n1!=null && n2 != null){
            if(n1.equals(n2)){
                return true;
            }else {
                return false;
            }
        }else{
            return false;
        }
    }

}
