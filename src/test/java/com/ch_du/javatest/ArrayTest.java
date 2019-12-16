package com.ch_du.javatest;

import org.testng.annotations.Test;

import java.util.Arrays;

public class ArrayTest {
    @Test
    public void testArrayDeclare() {
        int[] arr1;
        String[] arr2;
        int arr3[];
        String arr4[];
    }


    @Test
    public void testFuzhi() {
        int[] arr0 = new int[0];
        System.out.println(Arrays.toString(arr0));

        int[] arr1 = new int[5];
        System.out.println(Arrays.toString(arr1));

        boolean[] arr2 = new boolean[3];
        System.out.println(Arrays.toString(arr2));

        String[] arr3 = new String[3];
        System.out.println(Arrays.toString(arr3));

        Object[] arr4 = new Object[5];
        System.out.println(Arrays.toString(arr4));

        int[] arr5;
        System.out.println();
        arr5 = new int[2];
        System.out.println(Arrays.toString(arr5));

        int[] arr6 = new int[] {3, 2, 3};
        System.out.println("arr6 = " + Arrays.toString(arr6));

        int[] arr7 = {3, 2, 3};
        System.out.println("arr7 = " + Arrays.toString(arr7));

        String[] arr8 = {"字符串1", null, "字符串2", ""};
        System.out.println("arr8 = " + Arrays.toString(arr8));

        Integer[] arr9 = {2, 9, 7, null, 0, 5};
        System.out.println("arr9 = " + Arrays.toString(arr9));
    }

    @Test
    public void testBianLi() {
        // 示例：分别使用上述三种方式遍历数组 Integer[] arr = {1, 2, 3, 4, 5};
        Integer[] arr = {1, 2, 3, 4, 5};

        for (int index = 0; index < arr.length; index++) {
            // System.out.println("下标：" + index + ", 存放的值是：" + arr[index]);
            System.out.println(String.format("下标：%d, 存放的值是：%d", index, arr[index]));
        }

        int index = 0;
        for (int val : arr) {
            System.out.println("第" + index + "次取到" + val);
            index++;
        }

        Arrays.asList(arr).forEach(val -> {
            System.out.println("值是：" + val);
            if (val % 2 == 0) {
                System.out.println("  它是一个偶数");
            } else {
                System.out.println("  它是一个奇数");
            }
        });
    }

    @Test
    public void testCopy() {
        Integer[] arr1 = {1, 2, 3, 4, 5, 6, 7};
        Integer[] arr2 = {6, 7, 8, 9, 10};
        // 拷贝数组 arr1 的前 3 个元素生成一个新的数组
        Integer[] arr11 = new Integer[3];
        arr11[0] = arr1[0];
        arr11[1] = arr1[1];
        arr11[2] = arr1[2];
        System.out.println("arr11 = " + Arrays.toString(arr11));

        Integer arr12[] = Arrays.copyOf(arr1, 3);
        System.out.println("arr12 = " + Arrays.toString(arr12));

        // 拷贝数组 arr1 的后 3 位的元素到一个新的数组
        Integer arr13[] = Arrays.copyOfRange(arr1, arr1.length - 3, arr1.length);
        System.out.println("arr13 = " + Arrays.toString(arr13));

        // 拷贝数组 arr1 的第 1 位到第 3 位的元素（不包括第 3 位）
        Integer arr14[] = Arrays.copyOfRange(arr1, 0, 2);
        System.out.println("arr14 = " + Arrays.toString(arr14));

        // 拷贝数组 arr2 的后 3 位到 arr1 到后 3 位
        System.arraycopy(arr2, arr2.length - 3, arr1, arr1.length - 3, 3);
        System.out.println("arr1 = " + Arrays.toString(arr1));
    }
}
