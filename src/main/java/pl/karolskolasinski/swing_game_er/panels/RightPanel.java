package pl.karolskolasinski.swing_game_er.panels;

import pl.karolskolasinski.swing_game_er.buttons.OpenButton;
import pl.karolskolasinski.swing_game_er.labels.TextLabel;
import pl.karolskolasinski.swing_game_er.text_fields.ResultTextField;

import javax.swing.*;
import java.awt.*;

public class RightPanel extends JPanel {

    public RightPanel(LeftButtonsPanel leftButtonsPanel) {
        setLayout(new BorderLayout());
        CodePanel codePanel = createCodePanel();
        TextLabel hexLabel = codePanel.getCodeComponentsPanel().getHexLabel();
        ResultTextField resultTextField = codePanel.getCodeComponentsPanel().getResultTextField();
        OpenButton openButton = codePanel.getCodeComponentsPanel().getOpenButton();
        createResetPanel(leftButtonsPanel, hexLabel, resultTextField, openButton);
    }

    private CodePanel createCodePanel() {
        CodePanel codePanel = new CodePanel();
        add(codePanel, BorderLayout.CENTER);
        return codePanel;
    }

    private void createResetPanel(LeftButtonsPanel leftButtonsPanel, TextLabel hexLabel, ResultTextField resultTextField, OpenButton openButton) {
        add(new ResetPanel(leftButtonsPanel, hexLabel, resultTextField, openButton), BorderLayout.NORTH);
    }

}
