package org.example;

import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CsvReaderTest {

    @Test
    void testCalculateSum() throws IOException {
        CsvReader reader = new CsvReader();

        List<Integer> numbers = reader.readNumbersFromCsv("numbers.csv");
        int sum = reader.calculateSum(numbers);

        assertEquals(15, sum);
    }
}
