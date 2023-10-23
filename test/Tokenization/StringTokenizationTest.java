package Tokenization;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class StringTokenizationTest {
    @Test
    public void stringIsSplitTest() {
        String text = "Aghogho is a successful Software Engineer";
        String [] expectedTokens = {"Aghogho", "is", "a", "successful", "Software", "Engineer"};
        String [] actualTokens = StringTokenization.split(text);
        assertArrayEquals(actualTokens, expectedTokens);



    }
}
