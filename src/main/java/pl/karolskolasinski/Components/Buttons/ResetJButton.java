package pl.karolskolasinski.Components.Buttons;

import pl.karolskolasinski.Components.Buttons.JButtonsSettings.JButtonsSettings;
import pl.karolskolasinski.Components.Panels.LeftPanel;
import pl.karolskolasinski.Components.Panels.ResetPanel;

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
