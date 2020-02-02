package pl.karolskolasinski.swing_game_er.model_factory.panels;

import pl.karolskolasinski.swing_game_er.model_factory.labels.TextLabel;

import javax.swing.*;
import java.awt.*;

public class RightPanel extends JPanel {

    public RightPanel(LeftButtonsPanel leftButtonsPanel) {
        setLayout(new BorderLayout());
        CodePanel codePanel = createCodePanel();
        TextLabel hexLabel = codePanel.getCodeComponentsPanel().getHexLabel();
        createResetPanel(leftButtonsPanel, hexLabel);
    }

    private CodePanel createCodePanel() {
        CodePanel codePanel = new CodePanel();
        add(codePanel, BorderLayout.CENTER);
        return codePanel;
    }

    private void createResetPanel(LeftButtonsPanel leftButtonsPanel, TextLabel hexLabel) {
        add(new ResetPanel(leftButtonsPanel, hexLabel), BorderLayout.NORTH);
    }

}
