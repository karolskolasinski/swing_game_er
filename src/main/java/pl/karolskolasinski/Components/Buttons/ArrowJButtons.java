package pl.karolskolasinski.Components.Buttons;

import pl.karolskolasinski.Components.Buttons.JButtonsSettings.JButtonsSettings;
import pl.karolskolasinski.Components.Panels.LeftPanel;

import javax.swing.*;
import java.awt.*;

public class ArrowJButtons {
    private JButton[] jButtons = new JButton[7];

    public ArrowJButtons(LeftPanel leftPanel) {
        for (int i = 0; i < jButtons.length; i++) {
            jButtons[i] = new JButton();
        }

        JButtonsSettings jButtonsSettings = new JButtonsSettings();
        jButtonsSettings.arrowDownButtonSettings(jButtons[0]);
        jButtonsSettings.boundsSetter(jButtons[0], new Rectangle((leftPanel.getLeftPanel().getWidth() / 2) - 30, 30, 60, 60));

        jButtonsSettings.arrowDownButtonSettings(jButtons[1]);
        jButtonsSettings.boundsSetter(jButtons[1], new Rectangle((leftPanel.getLeftPanel().getWidth() / 2) - 30, 100, 60, 60));

        jButtonsSettings.arrowDownButtonSettings(jButtons[2]);
        jButtonsSettings.boundsSetter(jButtons[2], new Rectangle((leftPanel.getLeftPanel().getWidth() / 2) - 30, 170, 60, 60));

        jButtonsSettings.blankButtonSettings(jButtons[3]);
        jButtonsSettings.boundsSetter(jButtons[3], new Rectangle((leftPanel.getLeftPanel().getWidth() / 2) - 30, 240, 60, 60));

        jButtonsSettings.arrowUpButtonSettings(jButtons[4]);
        jButtonsSettings.boundsSetter(jButtons[4], new Rectangle((leftPanel.getLeftPanel().getWidth() / 2) - 30, 310, 60, 60));

        jButtonsSettings.arrowUpButtonSettings(jButtons[5]);
        jButtonsSettings.boundsSetter(jButtons[5], new Rectangle((leftPanel.getLeftPanel().getWidth() / 2) - 30, 380, 60, 60));

        jButtonsSettings.arrowUpButtonSettings(jButtons[6]);
        jButtonsSettings.boundsSetter(jButtons[6], new Rectangle((leftPanel.getLeftPanel().getWidth() / 2) - 30, 450, 60, 60));
    }

    public JButton[] getjButtons() {
        return jButtons;
    }
}
