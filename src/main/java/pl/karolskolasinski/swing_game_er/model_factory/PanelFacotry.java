package pl.karolskolasinski.swing_game_er.model_factory;

import javax.swing.*;

public abstract class PanelFacotry {

    public static JPanel createLeftPanel(int x, int y, int width, int height) {
        return parametrizePanel(x, y, width, height, "Play this game");
    }

    public static JPanel createRightPanel(int x, int y, int width, int height) {
        return parametrizePanel(x, y, width, height, "Get the code");
    }

    public static JPanel createResetPanel(int x, int y, int width, int height) {
        return parametrizePanel(x, y, width, height, "Reset");
    }

    private static JPanel parametrizePanel(int x, int y, int width, int height, String title) {
        JPanel panel = new JPanel();
        panel.setBorder(BorderFactory.createTitledBorder(title));
        panel.setBounds(x, y, width, height);
        return panel;
    }
}
