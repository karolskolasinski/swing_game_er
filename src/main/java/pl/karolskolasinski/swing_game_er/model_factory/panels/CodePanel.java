package pl.karolskolasinski.swing_game_er.model_factory.panels;

import javax.swing.*;

public class CodePanel extends JPanel {
    private final static String PANEL_TITLE = "Get the code";
    private LeftPanel leftPanel;

    public CodePanel(LeftPanel leftPanel) {
        this.leftPanel = leftPanel;
        setBorder(BorderFactory.createTitledBorder(PANEL_TITLE));
        createInsidePanel();
    }

    private void createInsidePanel() {
        add(new CodeComponentPanel(leftPanel));
    }

}
