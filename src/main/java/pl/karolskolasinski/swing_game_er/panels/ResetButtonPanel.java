package pl.karolskolasinski.swing_game_er.panels;

import pl.karolskolasinski.swing_game_er.buttons.OpenButton;
import pl.karolskolasinski.swing_game_er.buttons.ResetButton;
import pl.karolskolasinski.swing_game_er.interfaces.IResetPanel;
import pl.karolskolasinski.swing_game_er.labels.TextLabel;
import pl.karolskolasinski.swing_game_er.text_fields.ResultTextField;

import javax.swing.*;

public class ResetButtonPanel extends JPanel implements IResetPanel {
    private LeftButtonsPanel leftButtonsPanel;
    private TextLabel hexLabel;
    private ResultTextField resultTextField;
    private OpenButton openButton;

    ResetButtonPanel(LeftButtonsPanel leftButtonsPanel, TextLabel hexLabel, ResultTextField resultTextField, OpenButton openButton) {
        this.leftButtonsPanel = leftButtonsPanel;
        this.hexLabel = hexLabel;
        this.resultTextField = resultTextField;
        this.openButton = openButton;
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
        resetOpenButton();
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

    private void resetOpenButton() {
        openButton.setVisible(false);
    }

}

