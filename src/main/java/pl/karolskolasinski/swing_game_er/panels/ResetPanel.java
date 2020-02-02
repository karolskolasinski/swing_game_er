package pl.karolskolasinski.swing_game_er.panels;

import pl.karolskolasinski.swing_game_er.buttons.OpenButton;
import pl.karolskolasinski.swing_game_er.labels.TextLabel;
import pl.karolskolasinski.swing_game_er.text_fields.ResultTextField;

import javax.swing.*;
import java.awt.*;

class ResetPanel extends JPanel {
    private final static String PANEL_TITLE = "Reset";

     ResetPanel(LeftButtonsPanel leftButtonsPanel, TextLabel hexLabel, ResultTextField resultTextField, OpenButton openButton) {
        setLayout(new GridBagLayout());
        setBorder(BorderFactory.createTitledBorder(PANEL_TITLE));
        createInsidePanel(leftButtonsPanel, hexLabel, resultTextField, openButton);
    }

    private void createInsidePanel(LeftButtonsPanel leftButtonsPanel, TextLabel hexLabel, ResultTextField resultTextField, OpenButton openButton) {
        add(new ResetButtonPanel(leftButtonsPanel, hexLabel, resultTextField, openButton));
    }

}
