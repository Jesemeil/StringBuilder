package Tokenization;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class AnagramCheckerTest {
    @Test
    public void testIsAnagram () {
        assertTrue(AnagramChecker.isAnagram("melody", "dyolem"));
        assertTrue(AnagramChecker.isAnagram("chair", "richa"));
    }
}
