package pl.karolskolasinski.model.button;

import pl.karolskolasinski.model.button.jbuttons_settings.JButtonsSettings;
import pl.karolskolasinski.model.panel.LeftPanel;
import pl.karolskolasinski.model.panel.ResetPanel;

import javax.swing.*;
import java.awt.*;

public class OpenLinkJButton {
    private final JButton openLinkJButton = new JButton("OPEN");

    public OpenLinkJButton(LeftPanel leftPanel, ResetPanel resetPanel) {
        JButtonsSettings jButtonsSettings = new JButtonsSettings();
        jButtonsSettings.openLinkButtonSettings(openLinkJButton);
        jButtonsSettings.boundsSetter(openLinkJButton, new Rectangle(leftPanel.getLeftPanel().getWidth() + ((resetPanel.getResetPanel().getWidth() / 2) - 75), 375, 150, 50));
    }

    public JButton getOpenLinkJButton() {
        return openLinkJButton;
    }
}
