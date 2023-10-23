package Tokenization;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class StringTokenization1Test {
    @Test
    public void testThatStringIsSplit() {
        StringTokenization1 tokenizer = new StringTokenization1();
        String text = "God would restore me in thousand folds";
        String[] actualToken = tokenizer.split(text);
        String[] expectedToken = {"God", "would", "restore", "me", "in",
                "thousand", "folds"};
        assertArrayEquals(actualToken, expectedToken);

    }

}
