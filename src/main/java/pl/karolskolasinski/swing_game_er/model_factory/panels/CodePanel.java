package pl.karolskolasinski.swing_game_er.model_factory.panels;

import javax.swing.*;
import java.awt.*;

class CodePanel extends JPanel {
    private final static String PANEL_TITLE = "Get the code";
    private LeftButtonsPanel leftButtonsPanel;
    private CodeComponentsPanel codeComponentsPanel;

    CodePanel(LeftButtonsPanel leftButtonsPanel) {
        setLayout(new GridBagLayout());
        this.leftButtonsPanel = leftButtonsPanel;
        setBorder(BorderFactory.createTitledBorder(PANEL_TITLE));
        createInsidePanel();
    }

    private void createInsidePanel() {
        codeComponentsPanel = new CodeComponentsPanel(leftButtonsPanel);
        add(codeComponentsPanel);
    }

    CodeComponentsPanel getCodeComponentsPanel() {
        return codeComponentsPanel;
    }
}
