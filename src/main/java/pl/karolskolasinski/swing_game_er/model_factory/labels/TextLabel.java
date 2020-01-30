package pl.karolskolasinski.swing_game_er.model_factory.labels;

import javax.swing.*;
import java.awt.*;

public class TextLabel extends JLabel {
    private static final String HEX = "<html><span style='font-family: monospace;'>#HEX</span></html>";
    private static final String RED = "<html><span style='font-family: monospace;'>+3x</span><span style='font-size: 15px; color: red;'>\uD83D\uDD3B</span></html>";
    private static final String GREEN = "<html><span style='font-family: monospace;'>-5x</span><span style='font-size: 15px; color: rgb(0, 255, 0);'>\uD83D\uDD3A</span></html>";
    private static final Color COLOR = Color.DARK_GRAY;
    private static final Font FONT = new Font(Font.SANS_SERIF, Font.PLAIN, 26);
    private static final int LABEL_SIZE_VERTICAL = 35;
    private static final int LABEL_SIZE_HORIZONTAL = 150;
    private static final Dimension LABEL_DIMENSION = new Dimension(LABEL_SIZE_HORIZONTAL, LABEL_SIZE_VERTICAL);


    public TextLabel(LabelType labelType) {
        if (labelType == LabelType.HEX) {
            setText(HEX);
        } else if (labelType == LabelType.RED) {
            setText(RED);
        } else if (labelType == LabelType.GREEN) {
            setText(GREEN);
        }

        setHorizontalAlignment(RIGHT);
        setForeground(COLOR);
        setFont(FONT);
        setPreferredSize(LABEL_DIMENSION);
    }

}
