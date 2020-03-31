package com.company.calculator;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        CalculatorImpl calculatorImpl = new CalculatorImpl();

        //Создаем объект Scanner
        Scanner scanner1 = new Scanner(System.in);

        //Присваиваем переменной первое введенное значение
        System.out.println("1: Запустить выполнение калькулятора \n" +
                "2: Поиск максимального слова в массиве");
        int action = scanner1.nextInt();

        if (action == 1) {
            calculatorImpl.calculator();
        } else if (action == 2) {
            calculatorImpl.findLongestWord();
        }
    }
}
