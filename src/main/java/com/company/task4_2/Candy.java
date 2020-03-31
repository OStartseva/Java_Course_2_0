package com.company.task4_2;

public class Candy extends Sweetness {

    String taste;

    public Candy(String name, double weight, int price, String taste) {
        super(name, weight, price);
        this.taste = taste;
    }



    @Override
    public String toString() {
        return "Конфета " +
                "Название='" + super.getName() + '\'' +
                ", Вес=" + super.getWeight() +
                ", Цена=" + super.getPrice() +
                ", Уникальный параметр='" + taste + '\'';
    }
}
