package com.company.task4_1;

import java.util.Arrays;

public class Array {

    public static void main(String[] args) {

        int[] arr = new int[20];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * (20 + 1)) - 10;

        }
        Arrays.sort(arr);
        System.out.println("Минимальный элемент: " + arr[0]);
        System.out.println("Максимальный элемент: " + arr[19]);


        int tmp = arr[0];
        arr[0] = arr[19];
        arr[19] = tmp;


        System.out.println(Arrays.toString(arr));

    }
}
