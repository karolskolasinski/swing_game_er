package pl.karolskolasinski.swing_game_er.model_factory.panels;

import pl.karolskolasinski.swing_game_er.model_factory.buttons.ResetButton;
import pl.karolskolasinski.swing_game_er.model_factory.interfaces.IResetPanel;
import pl.karolskolasinski.swing_game_er.model_factory.labels.TextLabel;
import pl.karolskolasinski.swing_game_er.model_factory.text_fields.ResultTextField;

import javax.swing.*;

public class ResetButtonPanel extends JPanel implements IResetPanel {
    private LeftButtonsPanel leftButtonsPanel;
    private TextLabel hexLabel;
    private ResultTextField resultTextField;

    ResetButtonPanel(LeftButtonsPanel leftButtonsPanel, TextLabel hexLabel, ResultTextField resultTextField) {
        this.leftButtonsPanel = leftButtonsPanel;
        this.hexLabel = hexLabel;
        this.resultTextField = resultTextField;
        add(createResetButton());
    }

    private ResetButton createResetButton() {
        return new ResetButton(this);
    }

    @Override
    public void reset() {
        resetLeftButtonPanel();
        resetHexLabel();
        resetResultTextField();
    }

    private void resetLeftButtonPanel() {
        leftButtonsPanel.addButtonsToArray();
        leftButtonsPanel.addAll();
        leftButtonsPanel.revalidate();
        leftButtonsPanel.repaint();
    }

    private void resetHexLabel() {
        hexLabel.setText(TextLabel.getHexBefore());
        hexLabel.revalidate();
        hexLabel.repaint();
    }

    private void resetResultTextField() {
        resultTextField.reset();
    }

}

