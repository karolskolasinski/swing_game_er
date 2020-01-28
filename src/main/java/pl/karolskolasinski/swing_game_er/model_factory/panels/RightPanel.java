package pl.karolskolasinski.swing_game_er.model_factory.panels;

import javax.swing.*;
import java.awt.*;

public class RightPanel extends JPanel {
    private final static String PANEL_TITLE = "Get the code";
    private LeftPanel leftPanel;

    public RightPanel(int windowWidth, int windowHeight, LeftPanel leftPanel) {
        this.leftPanel = leftPanel;
        setBounds(LeftPanel.PANEL_WIDTH, ResetPanel.PANEL_HEIGHT, windowWidth - LeftPanel.PANEL_WIDTH, windowHeight - ResetPanel.PANEL_HEIGHT);
        setBorder(BorderFactory.createTitledBorder(PANEL_TITLE));
        createInsidePanel();
    }

    private void createInsidePanel() {
        add(new RightComponentPanel(leftPanel));
    }

}
