package pl.karolskolasinski.model_factory;

import javax.swing.*;
import java.awt.*;

public abstract class ButtonFacory {

    public static JButton createArrowDownButton(int x, int y, int width, int height) {
        return parametrizeButton("\uD83D\uDD3B", Color.RED, true, x, y, width, height);
    }

    public static JButton createArrowUpButton(int x, int y, int width, int height) {
        return parametrizeButton("\uD83D\uDD3A", Color.GREEN, true, x, y, width, height);
    }

    public static JButton createBlankButton(int x, int y, int width, int height) {
        return parametrizeButton("", null, false, x, y, width, height);  //todo: null?????????
    }

    public static JButton createRestetButton(int x, int y, int width, int height) {
        return parametrizeButton("\uD83D\uDD04", Color.DARK_GRAY, true, x, y, width, height);
    }

    public static JButton createOpenLinkButton(int x, int y, int width, int height) {
        JButton button = parametrizeButton("OPEN", Color.DARK_GRAY, true, x, y, width, height);
        button.setVisible(false);
        return button;
    }

    private static JButton parametrizeButton(String title, Color foregroundColor, boolean isEnabled, int x, int y, int width, int height) {
        JButton button = new JButton(title);
        button.setForeground(foregroundColor);
        button.setFont(new Font(Font.SANS_SERIF, Font.PLAIN, 20));
        button.setFocusable(false);
        button.setEnabled(isEnabled);
        button.setRolloverEnabled(false);
        button.setBounds(x, y, width, height);
        return button;
    }

}
