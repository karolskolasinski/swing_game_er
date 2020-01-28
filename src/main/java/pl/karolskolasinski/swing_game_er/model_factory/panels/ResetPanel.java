package pl.karolskolasinski.swing_game_er.model_factory.panels;

import javax.swing.*;
import java.awt.*;

public class ResetPanel extends JPanel {
    private final static String PANEL_TITLE = "Reset";
    final static int PANEL_HEIGHT = 120;

    public ResetPanel(int windowWidth, LeftPanel leftPanel) {
        setBounds(LeftPanel.PANEL_WIDTH, 0, windowWidth - LeftPanel.PANEL_WIDTH, PANEL_HEIGHT);
        setBorder(BorderFactory.createTitledBorder(PANEL_TITLE));
        createInsidePanel(leftPanel);
        setLayout(new GridBagLayout());
    }

    private void createInsidePanel(LeftPanel leftPanel) {
        add(new ResetButtonPanel(leftPanel));
    }

}
