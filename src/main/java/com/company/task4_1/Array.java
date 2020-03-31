package com.company.task4_1;

import java.util.Arrays;

public class Array {

    public static void main(String[] args) {

        int[] arr = new int[20];
        int minIndex = 0;
        int maxIndex = 0;

        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * (20 + 1)) - 10;
        }

        int min = Arrays.stream(arr).filter(n -> n > 0).min().getAsInt();
        int max = Arrays.stream(arr).filter(n -> n < 0).max().getAsInt();

        for (int i = 0; i < arr.length; i++){
            if (arr[i] == min){
                minIndex = i;
                break;
            }
        }

        for (int i = 0; i < arr.length; i++){
            if (arr[i] == max){
                maxIndex = i;
                break;
            }
        }

        int tmp = arr[minIndex];
        arr[minIndex] = arr[maxIndex];
        arr[maxIndex] = arr[minIndex];

        System.out.println("Первоначальный массив: " + Arrays.toString(arr));
        System.out.println("Минимальный положительный элемент массива : " + min);
        System.out.println("Максимальный отрицательный элемент массива: " + max);
        System.out.println("Массив после замены местами элементов :" + Arrays.toString(arr));





    }
}
