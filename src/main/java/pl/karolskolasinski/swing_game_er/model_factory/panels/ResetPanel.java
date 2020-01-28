package pl.karolskolasinski.swing_game_er.model_factory.panels;

import javax.swing.*;
import java.awt.*;

class ResetPanel extends JPanel {
    private final static String PANEL_TITLE = "Reset";

    ResetPanel(LeftButtonsPanel leftButtonsPanel) {
//        setLayout(new GridBagLayout());
        setBorder(BorderFactory.createTitledBorder(PANEL_TITLE));
        createInsidePanel(leftButtonsPanel);
    }

    private void createInsidePanel(LeftButtonsPanel leftButtonsPanel) {
        add(new ResetButtonPanel(leftButtonsPanel));
    }

}
