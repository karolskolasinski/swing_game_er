package pl.karolskolasinski.swing_game_er.model_factory.labels;

import pl.karolskolasinski.swing_game_er.model_factory.buttons.ButtonType;
import pl.karolskolasinski.swing_game_er.model_factory.interfaces.IPlayPanel;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TextLabel extends JLabel {
    private static final String HEX = "<html><span style='font-family: monospace;'>#HEX</span></html>";
    private static final String RED = "<html><span style='font-family: monospace;'>+3x</span><span style='font-size: 15px; color: red;'>\uD83D\uDD3B</span></html>";
    private static final String GREEN = "<html><span style='font-family: monospace;'>-5x</span><span style='font-size: 15px; color: rgb(0, 255, 0);'>\uD83D\uDD3A</span></html>";
    private static final Color COLOR = Color.DARK_GRAY;
    private static final Font FONT = new Font(Font.SANS_SERIF, Font.PLAIN, 26);


    private static final int ARROW_BUTTON_SIZE_VERTICAL = 60;
    private static final int ARROW_BUTTON_SIZE_HORIZONTAL = 60;
    private static final Dimension ARROW_DIMENSION = new Dimension(ARROW_BUTTON_SIZE_HORIZONTAL, ARROW_BUTTON_SIZE_VERTICAL);


    public TextLabel(LabelType labelType) {
        if (labelType == LabelType.HEX) {
            setText(HEX);
        } else if (labelType == LabelType.RED) {
            setText(RED);
        } else if (labelType == LabelType.GREEN) {
            setText(GREEN);
        }

        setBorder(null);
//        setBounds(x, y, width, height);
//        setHorizontalAlignment(RIGHT);
        setForeground(COLOR);
        setFont(FONT);
//        setPreferredSize(ARROW_DIMENSION);
    }

}

