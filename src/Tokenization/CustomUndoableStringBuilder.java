package Tokenization;

import java.util.Stack;

public class CustomUndoableStringBuilder {
    private StringBuilder text;
    private Stack<String> undoStack = new Stack<>();

    public CustomUndoableStringBuilder(String initialText) {
        this.text = new StringBuilder(initialText);
    }

    public CustomUndoableStringBuilder() {
        this.text = new StringBuilder();
    }

    public StringBuilder undo() {
        if (!undoStack.isEmpty()) {
            text = new StringBuilder(undoStack.pop());
        }
        return text;
    }

    public StringBuilder appendText(String newText) {
        makeUndoable();
        text.append(newText);
        return text;
    }

    public StringBuilder replaceText(int start, int end, String replacement) {
        makeUndoable();
        text.replace(start, end, replacement);
        return text;
    }

    public StringBuilder reverseText() {
        makeUndoable();
        text.reverse();
        return text;
    }

    public StringBuilder insertText(int offset, String insertion) {
        makeUndoable();
        text.insert(offset, insertion);
        return text;
    }

    private void makeUndoable() {
        undoStack.push(text.toString());
    }

    @Override
    public String toString() {
        return text.toString();
    }

    public static void main(String[] args) {
        CustomUndoableStringBuilder usb = new CustomUndoableStringBuilder();
        usb.appendText("to be or not to be");
        System.out.println(usb);

        usb.replaceText(3, 5, "eat");
        System.out.println(usb);

        usb.replaceText(17, 19, "eat");
        System.out.println(usb);

        usb.reverseText();
        System.out.println(usb);

        usb.undo();
        System.out.println(usb);

        usb.undo();
        System.out.println(usb);

        usb.undo();
        System.out.println(usb);
    }
}

