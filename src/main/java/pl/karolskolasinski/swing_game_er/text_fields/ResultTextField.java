package pl.karolskolasinski.swing_game_er.text_fields;

import pl.karolskolasinski.swing_game_er.panels.CodeComponentsPanel;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class ResultTextField extends JTextField {
    private static final String RESULT = Integer.toHexString(0xcccccc + 3 * 0xFF0000 - 5 * 0x00FF00).toUpperCase();
    private static final String RESET_TEXT = "";
    private static final Font FONT = new Font(Font.SANS_SERIF, Font.PLAIN, 20);
    private static final int TEXTFIELD_SIZE_VERTICAL = 35;
    private static final int TEXTFIELD_SIZE_HORIZONTAL = 150;
    private static final Dimension TEXTFIELD_DIMENSION = new Dimension(TEXTFIELD_SIZE_HORIZONTAL, TEXTFIELD_SIZE_VERTICAL);

    public ResultTextField(CodeComponentsPanel codeComponentsPanel) {
        this.setBorder(BorderFactory.createEtchedBorder());
        this.setHorizontalAlignment(CENTER);
        this.setFont(FONT);
        this.setPreferredSize(TEXTFIELD_DIMENSION);
        this.setDocument(new JTextFieldLimit(7));
        System.out.println(RESULT); //todo delete
        addCodeProvidedByUserChecker(codeComponentsPanel);
    }

    private void addCodeProvidedByUserChecker(CodeComponentsPanel codeComponentsPanel) {
        this.addKeyListener(new KeyAdapter() {
            @Override
            public void keyReleased(KeyEvent e) {
                if (codeProvidedByUser().equals(RESULT)) {
                    codeComponentsPanel.changeOpenButtonVisibility(true);
                } else {
                    codeComponentsPanel.changeOpenButtonVisibility(false);
                }
            }
        });
    }

    private String codeProvidedByUser() {
        return this.getText();
    }

    public void reset() {
        this.setText(RESET_TEXT);
    }

}
