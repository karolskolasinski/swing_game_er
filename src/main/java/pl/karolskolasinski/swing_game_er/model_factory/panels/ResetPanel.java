package pl.karolskolasinski.swing_game_er.model_factory.panels;

import pl.karolskolasinski.swing_game_er.model_factory.labels.TextLabel;
import pl.karolskolasinski.swing_game_er.model_factory.text_fields.ResultTextField;

import javax.swing.*;
import java.awt.*;

class ResetPanel extends JPanel {
    private final static String PANEL_TITLE = "Reset";

    ResetPanel(LeftButtonsPanel leftButtonsPanel, TextLabel hexLabel, ResultTextField resultTextField) {
        setLayout(new GridBagLayout());
        setBorder(BorderFactory.createTitledBorder(PANEL_TITLE));
        createInsidePanel(leftButtonsPanel, hexLabel, resultTextField);
    }

    private void createInsidePanel(LeftButtonsPanel leftButtonsPanel, TextLabel hexLabel, ResultTextField resultTextField) {
        add(new ResetButtonPanel(leftButtonsPanel, hexLabel, resultTextField));
    }

}
