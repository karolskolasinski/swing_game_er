package pl.karolskolasinski.swing_game_er.model_factory.panels;

import javax.swing.*;
import java.awt.*;

public class LeftPanel extends JPanel {
    private final static String PANEL_TITLE = "Play this game";
    private LeftButtonsPanel leftButtonsPanel;

    public LeftPanel() {
        setBorder(BorderFactory.createTitledBorder(PANEL_TITLE));
        createInsidePanel();
    }

    private void createInsidePanel() {
        this.leftButtonsPanel = new LeftButtonsPanel();
        add(leftButtonsPanel);
    }

    LeftButtonsPanel getLeftButtonsPanel() {
        return leftButtonsPanel;
    }

}
