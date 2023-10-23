package Tokenization;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class DigitAdderTest {
    @Test
    public void testThatItSumsUpToASingleNumber() {
        int number1= 998;
        int expectedNumber1 = 8;
        int actualNumber1 = DigitAdder.addDigits(number1);

        int number2 = 0;
        int expectedNumber2 = 0;
        int actualNumber2 = DigitAdder.addDigits(number2);

        assertEquals(expectedNumber1, actualNumber1);
        assertEquals(expectedNumber2, actualNumber2);


    }
}
