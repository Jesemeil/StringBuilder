package Tokenization;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SumArrayTest {
    @Test
    public void testItGivesTheTotal() {
        int[] arr = {87, 68, 94, 100, 83, 78, 85, 91, 76, 87};
        int expectedTotal = 849;
        int actualTotal = SumArray.getTotal(arr);
        assertEquals(expectedTotal, actualTotal);
    }

}
