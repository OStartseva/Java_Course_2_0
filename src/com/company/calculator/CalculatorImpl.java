package com.company.calculator;


import java.util.*;

public class CalculatorImpl implements Calculator{

    public void calculator() {
        Scanner scanner1 = new Scanner(System.in);

        System.out.println("Введи первое дробное число: ");
        double first = scanner1.nextDouble();

        System.out.println("Арифметическая операция: ");
        Scanner scanner2 = new Scanner(System.in);
        String operator = scanner2.nextLine();

        //Присваиваем переменной второе введенное значение
        System.out.println("Введи второе дробное число: ");
        double second = scanner1.nextDouble();


        System.out.printf("%.4f", calculate(first, second, operator));
    }

    /**
     * @param first  first double
     * @param second second double
     * @return calculated value
     */

    public double calculate(Double first, Double second, String operator) {

        switch (operator) {
            case "*":
                return first * second;
            case "/":
                return first / second;
            case "+":
                return first + second;
            default:
                return first - second;
        }
    }

    public void findLongestWord() {
        System.out.println("Введи размер массива: ");

        Scanner scanner = new Scanner(System.in);
        String[] arr = new String[scanner.nextInt()];

        System.out.println("Введите " + arr.length + " строки");

        Scanner scanner1 = new Scanner(System.in);

        for (int i = 0; i < arr.length; i++) {
            arr[i] = scanner1.nextLine();
        }

        System.out.println(longestWord(arr));
    }

    public String longestWord(String[] arr) {
        return Arrays.stream(arr).max(Comparator.comparing(String::length)).get();
    }
}

