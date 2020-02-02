package pl.karolskolasinski.swing_game_er.panels;

import javax.swing.*;
import java.awt.*;

class CodePanel extends JPanel {
    private final static String PANEL_TITLE = "Get the code";
    private CodeComponentsPanel codeComponentsPanel;

    CodePanel() {
        setLayout(new GridBagLayout());
        setBorder(BorderFactory.createTitledBorder(PANEL_TITLE));
        createInsidePanel();
    }

    private void createInsidePanel() {
        codeComponentsPanel = new CodeComponentsPanel();
        add(codeComponentsPanel);
    }

    CodeComponentsPanel getCodeComponentsPanel() {
        return codeComponentsPanel;
    }
}
