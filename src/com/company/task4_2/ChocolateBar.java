package com.company.task4_2;

public class ChocolateBar extends Sweetness {
    private String name = "Riter Sport";
    private double weight = 2;
    private int price = 52;
    private String uniqParam = "Большая шоколадка";

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
        return "Шоколадка " +
                "Название='" + name + '\'' +
                ", Вес=" + weight +
                ", Цена=" + price +
                ", Уникальный параметр='" + uniqParam + '\'' +
                '}';
    }

}
