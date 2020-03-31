package com.company.task4_2;

import java.util.ArrayList;

public class NewYearsGift {

    public static void main(String[] args) {

        ArrayList<Sweetness> gift = new ArrayList<>();
        gift.add(new Candy("Аленка", 12.2, 3, "Вкус малины"));
        gift.add(new Candy("Коровка", 10.2, 5, "Вкус карамели"));
        gift.add(new Candy("Грильяж", 11.6, 9, "Вкус ореха"));
        gift.add(new Jellybean("Мармелад", 1.1, 1, "Красный"));
        gift.add(new ChocolateBar("Бабаевский", 12.15, 5, 1999));

        System.out.println("Общая стоимость подарка: " + fullPrice(gift));
        System.out.println("Общий вес подарка: " + fullWeight(gift));

        System.out.println("Вся информация о сладостях в подарке: ");
        for (Sweetness s : gift) {
            System.out.println(s.toString());
        }
    }

    public static int fullPrice(ArrayList<Sweetness> sweetness) {
        int fullPrice = 0;

        for (int i = 0; i < sweetness.size(); i++) {
            fullPrice += sweetness.get(i).getPrice();
        }
        return fullPrice;
    }

    public static double fullWeight(ArrayList<Sweetness> sweetness) {
        int fullWeight = 0;
        for (int i = 0; i < sweetness.size(); i++) {
            fullWeight += sweetness.get(i).getWeight();
        }
        return fullWeight;
    }

}
