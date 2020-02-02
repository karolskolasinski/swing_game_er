package pl.karolskolasinski.swing_game_er.model_factory.panels;

import pl.karolskolasinski.swing_game_er.model_factory.labels.TextLabel;
import pl.karolskolasinski.swing_game_er.model_factory.text_fields.ResultTextField;

import javax.swing.*;
import java.awt.*;

public class RightPanel extends JPanel {

    public RightPanel(LeftButtonsPanel leftButtonsPanel) {
        setLayout(new BorderLayout());
        CodePanel codePanel = createCodePanel();
        TextLabel hexLabel = codePanel.getCodeComponentsPanel().getHexLabel();
        ResultTextField resultTextField = codePanel.getCodeComponentsPanel().getResultTextField();
        createResetPanel(leftButtonsPanel, hexLabel, resultTextField);
    }

    private CodePanel createCodePanel() {
        CodePanel codePanel = new CodePanel();
        add(codePanel, BorderLayout.CENTER);
        return codePanel;
    }

    private void createResetPanel(LeftButtonsPanel leftButtonsPanel, TextLabel hexLabel, ResultTextField resultTextField) {
        add(new ResetPanel(leftButtonsPanel, hexLabel, resultTextField), BorderLayout.NORTH);
    }

}
