package org.example;

import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVParser;
import org.apache.commons.csv.CSVRecord;

import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class CsvReader {

    public List<Integer> readNumbersFromCsv(String csvFile) throws IOException {
        FileReader reader = new FileReader(csvFile);

        CSVParser parser = CSVFormat.DEFAULT
                .withHeader("number")
                .withSkipHeaderRecord()
                .parse(reader);

        List<Integer> numbers = new ArrayList<>();

        for (CSVRecord record : parser) {
            numbers.add(Integer.parseInt(record.get("number")));
        }

        parser.close();
        return numbers;
    }

    public int calculateSum(List<Integer> numbers) {
        int sum = 0;
        for (int n : numbers) {
            sum += n;
        }
        return sum;
    }
}
