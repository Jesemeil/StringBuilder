package Tokenization;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SecondLargestNumberFinderTest {
    @Test
    public void testSecondLargestNumber() {
        String input = "er25647yt";
        int expectedNumber = 6;
        int actualNumber = SecondLargestNumberFinder.findSecondLargestNumber(input);
        assertEquals(expectedNumber, actualNumber);
    }

    @Test
    public void testSecondLargestNumberGivenThatAllNumbersAreSame() {
        String input = "fgh2222";
        int expectedNumber = 1;
        int actualNumber = SecondLargestNumberFinder.findSecondLargestNumber(input);
        assertEquals(expectedNumber, actualNumber);
    }
}
