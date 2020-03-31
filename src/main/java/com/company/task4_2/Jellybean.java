package com.company.task4_2;

public class Jellybean extends Sweetness {
   String color;

    public Jellybean(String name, double weight, int price, String color) {
        super(name, weight, price);
        this.color = color;
    }



    @Override
    public String toString() {
        return "Жевательная конфета " +
                "Название='" + super.getName() + '\'' +
                ", Вес=" + super.getWeight() +
                ", Цена=" + super.getPrice() +
                ", Уникальный параметр='" + color + '\'';
    }

}
