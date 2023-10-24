package Tokenization;

import org.junit.jupiter.api.Test;

import static Tokenization.Subset.isSubset;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class SubsetTest {
    @Test
    public void testItIsASubset() {
        String s1 = "ace";
        String t1 = "abcde";
        assertTrue(isSubset(s1, t1));

        String s2 = "met";
        String t2 = "stream";
        assertFalse(isSubset(s2, t2));

        String s3 = "stem";
        String t3 = "stream";
        assertTrue(isSubset(s3, t3));


    }




}
