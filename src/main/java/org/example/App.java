package org.example;

import java.io.IOException;
import java.util.List;

public class App {

    public static void main(String[] args) {
        CsvReader reader = new CsvReader();
        try {
            List<Integer> numbers = reader.readNumbersFromCsv("numbers.csv");
            int sum = reader.calculateSum(numbers);
            System.out.println("The sum is: " + sum);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
