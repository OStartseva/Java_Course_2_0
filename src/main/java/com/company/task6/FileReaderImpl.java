package com.company.task6;


import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class FileReaderImpl implements FileReader {
    String [] splitedString;

    public ArrayList<String> stringsFromFile() throws FileNotFoundException {
        File src = new File("src/com/company/task6/text.txt");
        Scanner scanner = new Scanner(src);
       ArrayList<String> stringsFromFile = new ArrayList<>();

       while (scanner.hasNext()){
           splitedString = scanner.nextLine().split(" ");
           stringsFromFile.addAll(Arrays.asList(splitedString));
       }

       return stringsFromFile;
    }
}
