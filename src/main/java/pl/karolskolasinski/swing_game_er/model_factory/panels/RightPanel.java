package pl.karolskolasinski.swing_game_er.model_factory.panels;

import javax.swing.*;
import java.awt.*;

public class RightPanel extends JPanel {

    public RightPanel(LeftButtonsPanel leftButtonsPanel) {
        setLayout(new BorderLayout());
        createResetPanel(leftButtonsPanel);
        createCodePanel(leftButtonsPanel);
    }

    private void createResetPanel(LeftButtonsPanel leftButtonsPanel) {
        add(new ResetPanel(leftButtonsPanel), BorderLayout.NORTH);
    }

    private void createCodePanel(LeftButtonsPanel leftButtonsPanel) {
        add(new CodePanel(leftButtonsPanel), BorderLayout.CENTER);
    }

}
