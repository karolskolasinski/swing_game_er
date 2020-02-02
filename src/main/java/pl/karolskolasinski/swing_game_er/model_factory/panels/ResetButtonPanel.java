package pl.karolskolasinski.swing_game_er.model_factory.panels;

import pl.karolskolasinski.swing_game_er.model_factory.buttons.ResetButton;
import pl.karolskolasinski.swing_game_er.model_factory.interfaces.IResetPanel;
import pl.karolskolasinski.swing_game_er.model_factory.labels.TextLabel;

import javax.swing.*;

public class ResetButtonPanel extends JPanel implements IResetPanel {
    private LeftButtonsPanel leftButtonsPanel;
    private TextLabel hexLabel;

    ResetButtonPanel(LeftButtonsPanel leftButtonsPanel, TextLabel hexLabel) {
        this.leftButtonsPanel = leftButtonsPanel;
        this.hexLabel = hexLabel;
        add(createResetButton());
    }

    private ResetButton createResetButton() {
        return new ResetButton(this);
    }

    @Override
    public void reset() {
        leftButtonsPanel.addButtonsToArray();
        leftButtonsPanel.addAll();
        leftButtonsPanel.revalidate();
        leftButtonsPanel.repaint();
        hexLabel.setText(TextLabel.getHexBefore());
        hexLabel.revalidate();
        hexLabel.repaint();
        resultTextField.reset();

    }

}

