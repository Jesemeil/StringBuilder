package Tokenization;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class CustomUndoableStringBuilderTest {

    @Test
    void testAppendText() {
        CustomUndoableStringBuilder builder = new CustomUndoableStringBuilder();
        builder.appendText("Hello");
        assertEquals("Hello", builder.toString());
    }

    @Test
    void testReplaceText() {
        CustomUndoableStringBuilder builder = new CustomUndoableStringBuilder("Hello, how are you?");
        builder.replaceText(7, 10, "doing");
        assertEquals("Hello, doing are you?", builder.toString());
    }

    @Test
    void testInsertText() {
        CustomUndoableStringBuilder builder = new CustomUndoableStringBuilder("Hello, how are you?");
        builder.insertText(19, " on this fine day?");
        assertEquals("Hello, how are you? on this fine day?", builder.toString());
    }

    @Test
    void testReverseText() {
        CustomUndoableStringBuilder builder = new CustomUndoableStringBuilder("Hello");
        builder.reverseText();
        assertEquals("olleH", builder.toString());
    }

    @Test
    void testUndo() {
        CustomUndoableStringBuilder builder = new CustomUndoableStringBuilder();
        builder.appendText("Hello");
        builder.replaceText(0, 5, "Hi");
        builder.insertText(2, " there");
        builder.reverseText();

        builder.undo();
        assertEquals("Hi there", builder.toString());

        builder.undo();
        assertEquals("Hi", builder.toString());

        builder.undo();
        assertEquals("Hello", builder.toString());
    }
}
