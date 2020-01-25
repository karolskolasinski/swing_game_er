package pl.karolskolasinski.swing_game_er.model_factory;

import javax.swing.*;
import java.awt.*;

import static javax.swing.SwingConstants.RIGHT;

public abstract class LabelFactory {

    public static JLabel createGreenCodeLabel(int x, int y, int width, int height) {
        return parametrizeLabel(x, y, width, height,
                "<html><span style='font-family: monospace;'>-5x</span><span style='font-size: 15px; color: rgb(0, 255, 0);'>\uD83D\uDD3A</span></html>");
    }

    public static JLabel createHexCodeLabel(int x, int y, int width, int height) {
        return parametrizeLabel(x, y, width, height,
                "<html><span style='font-family: monospace;'>#HEX</span></html>");
    }

    public static JLabel createRedCodeLabel(int x, int y, int width, int height) {
        return parametrizeLabel(x, y, width, height,
                "<html><span style='font-family: monospace;'>+3x</span><span style='font-size: 15px; color: red;'>\uD83D\uDD3B</span></html>");
    }

    private static JLabel parametrizeLabel(int x, int y, int width, int height, String text) {
        JLabel label = new JLabel();
        label.setBorder(null);
        label.setBounds(x, y, width, height);
        label.setHorizontalAlignment(RIGHT);
        label.setForeground(Color.DARK_GRAY);
        label.setFont(new Font(Font.SANS_SERIF, Font.PLAIN, 26));
        label.setText(text);
        return label;
    }


}
