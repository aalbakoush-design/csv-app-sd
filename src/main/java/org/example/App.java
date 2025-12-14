package org.example;

import org.apache.commons.csv.*;

import java.io.StringReader;

public class App {
    public static void main(String[] args) throws Exception {
        String data = "name,age\nAli,20\nSara,22";

        CSVParser parser = CSVFormat.DEFAULT
                .withFirstRecordAsHeader()
                .parse(new StringReader(data));

        for (CSVRecord record : parser) {
            System.out.println(record.get("name") + " - " + record.get("age"));
        }
    }
}
