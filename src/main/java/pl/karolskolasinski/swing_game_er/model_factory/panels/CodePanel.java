package pl.karolskolasinski.swing_game_er.model_factory.panels;

import javax.swing.*;

class CodePanel extends JPanel {
    private final static String PANEL_TITLE = "Get the code";
    private LeftButtonsPanel leftButtonsPanel;

    CodePanel(LeftButtonsPanel leftButtonsPanel) {
        this.leftButtonsPanel = leftButtonsPanel;
        setBorder(BorderFactory.createTitledBorder(PANEL_TITLE));
        createInsidePanel();
    }

    private void createInsidePanel() {
        add(new CodeComponentPanel(leftButtonsPanel));
    }

}
