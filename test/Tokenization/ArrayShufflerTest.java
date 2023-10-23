package Tokenization;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class ArrayShufflerTest {
    @Test
    public void testRemoveEvenNumber() {
        int[] array = {22, 41, 15, 8, 2, 1,};
        int[] expectedArray = {41, 15, 1};
        int[] actualArray = ArrayShuffler.removeEvenNumbers(array);
        assertArrayEquals(expectedArray, actualArray);
    }



}
