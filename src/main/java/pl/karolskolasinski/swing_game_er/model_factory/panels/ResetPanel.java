package pl.karolskolasinski.swing_game_er.model_factory.panels;

import javax.swing.*;
import java.awt.*;

public class ResetPanel extends JPanel {
    private final static String PANEL_TITLE = "Reset";
    final static int PANEL_HEIGHT = 120;

    public ResetPanel(LeftPanel leftPanel) {
        setBorder(BorderFactory.createTitledBorder(PANEL_TITLE));
        createInsidePanel(leftPanel);
        setLayout(new GridBagLayout());
    }

    private void createInsidePanel(LeftPanel leftPanel) {
        add(new ResetButtonPanel(leftPanel));
    }

}
