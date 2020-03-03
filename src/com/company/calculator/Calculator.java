package com.company.calculator;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {

        //Создаем объект Scanner
        Scanner scanner1 = new Scanner(System.in);

        //Присваиваем переменной первое введенное значение
        System.out.println("Введи первое дробное число: ");
        double first = scanner1.nextDouble();

        System.out.println("Арифметическая операция: ");
        Scanner scanner2 = new Scanner(System.in);
        String operator = scanner2.nextLine();


        //Присваиваем переменной второе введенное значение
        System.out.println("Введи второе дробное число: ");
        double second = scanner1.nextDouble();


        System.out.printf("%.4f", calculate(first, second, operator) );

    }

    /**
     * @param first first double
     * @param second second double
     * @return calculated value
     */

    public static double calculate(Double first, Double second, String operator){

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
}

