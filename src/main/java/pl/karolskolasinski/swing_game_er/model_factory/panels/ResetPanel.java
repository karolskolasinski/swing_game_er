package pl.karolskolasinski.swing_game_er.model_factory.panels;

import pl.karolskolasinski.swing_game_er.model_factory.labels.TextLabel;

import javax.swing.*;
import java.awt.*;

class ResetPanel extends JPanel {
    private final static String PANEL_TITLE = "Reset";

    ResetPanel(LeftButtonsPanel leftButtonsPanel, TextLabel hexLabel) {
        setLayout(new GridBagLayout());
        setBorder(BorderFactory.createTitledBorder(PANEL_TITLE));
        createInsidePanel(leftButtonsPanel, hexLabel);
    }

    private void createInsidePanel(LeftButtonsPanel leftButtonsPanel, TextLabel hexLabel) {
        add(new ResetButtonPanel(leftButtonsPanel, hexLabel));
    }

}
