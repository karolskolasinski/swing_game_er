package pl.karolskolasinski.model.button;

import pl.karolskolasinski.model.button.jbuttons_settings.JButtonsSettings;
import pl.karolskolasinski.model.panel.LeftPanel;
import pl.karolskolasinski.model.panel.ResetPanel;

import javax.swing.*;
import java.awt.*;

public class ResetJButton {
    private final JButton resetButton = new JButton("\uD83D\uDD04");

    public ResetJButton(LeftPanel leftPanel, ResetPanel resetPanel) {
        JButtonsSettings jButtonsSettings = new JButtonsSettings();
        jButtonsSettings.restetButtonSettings(resetButton);
        jButtonsSettings.boundsSetter(resetButton, new Rectangle(leftPanel.getLeftPanel().getWidth() + ((resetPanel.getResetPanel().getWidth() / 2) - 30), 30, 60, 60));
    }

    public JButton getResetButton() {
        return resetButton;
    }

}
