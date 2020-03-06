package com.company.task6;

import java.io.FileNotFoundException;
import java.util.ArrayList;

public interface FileReader {
    ArrayList<String> stringsFromFile() throws FileNotFoundException;
}
