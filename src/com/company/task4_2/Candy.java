package com.company.task4_2;

public class Candy extends Sweetness {
    private String name = "Столичные";
    private double weight = 1.1;
    private int price = 10;
    private String uniqParam = "Вкусная конфета";


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getUniqParam() {
        return uniqParam;
    }

    @Override
    public String toString() {
        return "Конфета " +
                "Название='" + name + '\'' +
                ", Вес=" + weight +
                ", Цена=" + price +
                ", Уникальный параметр='" + uniqParam + '\'' +
                '}';
    }
}
