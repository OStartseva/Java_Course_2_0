package com.company.task4_2;

public class ChocolateBar extends Sweetness {
    int productionYear;

    public ChocolateBar(String name, double weight, int price, int productionYear) {
        super(name, weight, price);
        this.productionYear = productionYear;
    }



    @Override
    public String toString() {
        return "Шоколадка " +
                "Название='" + super.getName() + '\'' +
                ", Вес=" + super.getWeight() +
                ", Цена=" + super.getPrice() +
                ", Уникальный параметр='" + productionYear + '\'';
    }

}
