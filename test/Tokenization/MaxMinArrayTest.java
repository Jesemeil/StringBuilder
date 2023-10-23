package Tokenization;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MaxMinArrayTest {
    @Test
    public void testThatMaximumNumberIsObtained() {
        int[] numbers = {5, 2, 9, 1, 8, 3, 7, 4, 6};
        int expectedMaximum = 9;
        int actualMaximum = MaxMinArray.getMaximum(numbers);
        assertEquals(expectedMaximum, actualMaximum);
    }

    @Test
    public void testThatMinimumNumberIsObtained() {
        int[] numbers = {5, 2, 9, 1, 8, 3, 7, 4, 6};
        int expectedMinimum = 1;
        int actualMinimum = MaxMinArray.getMinimum(numbers);
        assertEquals(expectedMinimum, actualMinimum);
    }
}
