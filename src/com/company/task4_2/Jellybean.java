package com.company.task4_2;

public class Jellybean extends Sweetness {
    private String name = "Mamba";
    private double weight = 1.5;
    private int price = 16;
    private String uniqParam = "Долго жевать";


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
        return "Жевательная конфета " +
                "Название='" + name + '\'' +
                ", Вес=" + weight +
                ", Цена=" + price +
                ", Уникальный параметр='" + uniqParam + '\'' +
                '}';
    }

}
