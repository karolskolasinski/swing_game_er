package pl.karolskolasinski.swing_game_er.model_factory.panels;

import javax.swing.*;
import java.awt.*;

class CodePanel extends JPanel {
    private final static String PANEL_TITLE = "Get the code";
    private LeftButtonsPanel leftButtonsPanel;

    CodePanel(LeftButtonsPanel leftButtonsPanel) {
        setLayout(new GridBagLayout());
        this.leftButtonsPanel = leftButtonsPanel;
        setBorder(BorderFactory.createTitledBorder(PANEL_TITLE));
        createInsidePanel();
    }

    private void createInsidePanel() {
        add(new CodeComponentPanel(leftButtonsPanel));
    }

}
