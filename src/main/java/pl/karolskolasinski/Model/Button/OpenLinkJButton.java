package pl.karolskolasinski.Model.Button;

import pl.karolskolasinski.Model.Button.JButtonsSettings.JButtonsSettings;
import pl.karolskolasinski.Model.Panel.LeftPanel;
import pl.karolskolasinski.Model.Panel.ResetPanel;

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
