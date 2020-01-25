package pl.karolskolasinski.swing_game_er.model_factory;

import javax.swing.*;
import java.awt.*;

public abstract class ButtonFacory {

    private static final String DOWN = "\uD83D\uDD3B";
    private static final String UP = "\uD83D\uDD3A";
    private static final String RESET = "\uD83D\uDD04";

    public static void paintArrowDownButton(JButton jButton) {
        parametrizeButton(jButton, DOWN, Color.RED, true);
    }

    public static void paintArrowUpButton(JButton jButton) {
        parametrizeButton(jButton, UP, Color.GREEN, true);
    }

    public static void paintBlankButton(JButton jButton) {
        parametrizeButton(jButton, "", null, false);
    }

    public static void paintRestetButton(JButton jButton) {
        parametrizeButton(jButton, RESET, Color.DARK_GRAY, true);
    }

    public static void paintOpenLinkButton(JButton jButton) {
        parametrizeButton(jButton, "OPEN", Color.DARK_GRAY, true);
        jButton.setVisible(false);
    }

    private static void parametrizeButton(JButton jButton, String text, Color foregroundColor, boolean isEnabled) {
        jButton.setText(text);
        jButton.setForeground(foregroundColor);
        jButton.setFont(new Font(Font.SANS_SERIF, Font.PLAIN, 20));
        jButton.setFocusable(false);
        jButton.setEnabled(isEnabled);
        jButton.setRolloverEnabled(false);
    }

    public static void boundsSetter(JButton jButton, int x, int y, int width, int height) {
        jButton.setBounds(x, y, width, height);
    }

    public static String getDOWN() {
        return DOWN;
    }

    public static String getUP() {
        return UP;
    }

}
