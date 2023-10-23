package Tokenization;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class ArraySwapperTest {
    @Test
    public void testZeroElementsMoveTOTheEnd () {
        int[] arr = {1, 2, 0, 5, 0, 6, 0, 7, 8, 9};
        int[] expectedArray = {1, 2, 5, 6, 7, 8, 9, 0, 0, 0};
        int[] actualArray = ArraySwapper.moveZerosToTheEnd(arr);
        assertArrayEquals(expectedArray, actualArray);
    }
}