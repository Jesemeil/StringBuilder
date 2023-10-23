package Tokenization;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class ArraySorterTest {
    @Test
    public void testThatArrayIsSorted() {
        int[] arr = {200, 1, 25, 6, 2, 3, 34, 67, 23, 123, 99, 65};
        int[] expectedArr = {1, 2, 3, 6, 23, 25, 34, 65, 67, 99, 123, 200};
        int[] actualArr = ArraySorter.sortArray(arr);
        assertArrayEquals(expectedArr, actualArr);
    }
}
