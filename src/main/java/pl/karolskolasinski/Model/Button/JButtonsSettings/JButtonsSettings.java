package pl.karolskolasinski.Model.Button.JButtonsSettings;

import javax.swing.*;
import java.awt.*;

public class JButtonsSettings {
    private final Font BUTTON_FONT = new Font(Font.SANS_SERIF, Font.PLAIN, 20);
    private final String DOWN = "\uD83D\uDD3B";
    private final String UP = "\uD83D\uDD3A";

    public void arrowDownButtonSettings(JButton jButton) {
        jButton.setText(DOWN);
        jButton.setForeground(Color.RED);
        jButton.setFont(BUTTON_FONT);
        jButton.setFocusable(false);
        jButton.setEnabled(true);
        jButton.setRolloverEnabled(false);
    }

    public void blankButtonSettings(JButton jButton) {
        jButton.setText("");
        jButton.setEnabled(false);
        jButton.setFocusable(false);
        jButton.setRolloverEnabled(false);
    }

    public void arrowUpButtonSettings(JButton jButton) {
        jButton.setText(UP);
        jButton.setForeground(Color.GREEN);
        jButton.setFont(BUTTON_FONT);
        jButton.setFocusable(false);
        jButton.setEnabled(true);
        jButton.setRolloverEnabled(false);
    }

    public void boundsSetter(JButton jButton, Rectangle rectangle) {
        jButton.setBounds(rectangle.x, rectangle.y, rectangle.width, rectangle.height);
    }

    public void restetButtonSettings(JButton jButton) {
        jButton.setForeground(Color.DARK_GRAY);
        jButton.setFont(BUTTON_FONT);
        jButton.setFocusable(false);
        jButton.setRolloverEnabled(false);
    }

    public void openLinkButtonSettings(JButton jButton) {
        jButton.setForeground(Color.DARK_GRAY);
        jButton.setFont(BUTTON_FONT);
        jButton.setVisible(false);
        jButton.setFocusable(false);
        jButton.setRolloverEnabled(false);
    }

    public String getDOWN() {
        return DOWN;
    }

    public String getUP() {
        return UP;
    }
}
