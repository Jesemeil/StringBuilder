package Tokenization;

import org.junit.jupiter.api.Test;


import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class BackspaceStringCompareTest {
    @Test
    public void testForSimilarity() {
        String s1 = "ab#d";
        String t1 = "ac#d";
        assertTrue(BackspaceStringCompare.compare(s1, t1));

        String s2 = "aq##";
        String t2 = "c#d#";
        assertTrue(BackspaceStringCompare.compare(s2, t2));

        String s3 = "aq##";
        String t3 = "ar#";
        assertFalse(BackspaceStringCompare.compare(s3, t3));
    }
}
