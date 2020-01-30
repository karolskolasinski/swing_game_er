package pl.karolskolasinski.swing_game_er.model_factory.text_fields;

import javax.swing.text.AttributeSet;
import javax.swing.text.BadLocationException;
import javax.swing.text.PlainDocument;

public class JTextFieldLimit extends PlainDocument {
    private int limit;

    JTextFieldLimit(int limit) {
        super();
        this.limit = limit;
    }

    public void insertString(int offset, String s, AttributeSet attributeSet) throws BadLocationException {
        if (s == null) {
            return;
        }

        if ((getLength() + s.length()) <= limit) {
            super.insertString(offset, s, attributeSet);
        }
    }

}
