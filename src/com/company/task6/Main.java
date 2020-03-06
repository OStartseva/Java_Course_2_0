package com.company.task6;

import java.io.*;
import java.util.*;
import java.util.Map.Entry;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {

        FileReader fileReader = new FileReaderImpl();

        //Прочитать слова из файла.
        ArrayList<String> unsortedWords = new ArrayList<>(fileReader.stringsFromFile());

        ArrayList<String> sortedWords = new ArrayList<>(unsortedWords);

        //Отсортировать в алфавитном порядке.
        Collections.sort(sortedWords);
        System.out.println("Сортированный список слов: " + sortedWords);


        // Посчитать сколько раз каждое слово встречается в файле.
        Set<String> setStr = new HashSet<>(sortedWords);
        Map<String, Long> wordCount = new HashMap<>();

        for (String s : setStr) {
            wordCount.put(s, sortedWords
                    .stream()
                    .filter(s::equals)
                    .count());
        }

        // Вывести статистику на консоль
        for (Entry<String, Long> entry : wordCount.entrySet()) {
            String key = entry.getKey();
            Long value = entry.getValue();
            System.out.println("Слово " + "\"" + key + "\"" + " встречается " + value + " раз");
        }

        //Найти слово с максимальным количеством повторений. Вывести на консоль это слово и сколько раз оно встречается в файле

        System.out.println("Чаще всего встречается слово " + "\"" + getKey(wordCount) + "\", " + getValue(wordCount) + " раз");


    }

    public static String getKey(Map<String, Long> wordCount) {
        return wordCount.entrySet()
                .stream()
                .filter(entry -> entry.getValue()
                        .equals(findMaxValue(wordCount)))
                .findFirst().get().getKey();
    }

    public static Long getValue(Map<String, Long> wordCount) {
        return wordCount
                .entrySet()
                .stream()
                .filter(entry -> entry.getValue()
                        .equals(findMaxValue(wordCount)))
                .findFirst().get().getValue();
    }

    public static <K, V extends Comparable<V>> V findMaxValue(Map<K, V> map) {
        Optional<Entry<K, V>> maxEntry = map.entrySet()
                .stream()
                .max(Comparator.comparing(Map.Entry::getValue));
        return maxEntry.get()
                .getValue();
    }
}
