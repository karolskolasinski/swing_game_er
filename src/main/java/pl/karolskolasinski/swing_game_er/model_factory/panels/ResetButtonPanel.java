package pl.karolskolasinski.swing_game_er.model_factory.panels;

import pl.karolskolasinski.swing_game_er.model_factory.buttons.ResetButton;
import pl.karolskolasinski.swing_game_er.model_factory.interfaces.IResetPanel;

import javax.swing.*;

public class ResetButtonPanel extends JPanel implements IResetPanel {
    private LeftPanel leftPanel;

    ResetButtonPanel(LeftPanel leftPanel) {
        this.leftPanel = leftPanel;
        ResetButton resetButton = createResetButton();
        add(resetButton);
    }

    private ResetButton createResetButton() {
        return new ResetButton(this);
    }

    @Override
    public void reset(ResetButton resetButton) {
        LeftButtonsPanel leftButtonsPanel = leftPanel.getLeftButtonsPanel();
        leftButtonsPanel.addButtonsToArray();
        leftButtonsPanel.addAll();
        leftButtonsPanel.revalidate();
        leftButtonsPanel.repaint();
    }

}

