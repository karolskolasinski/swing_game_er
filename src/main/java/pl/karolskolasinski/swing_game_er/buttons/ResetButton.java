package pl.karolskolasinski.swing_game_er.buttons;

import pl.karolskolasinski.swing_game_er.interfaces.IResetPanel;
import pl.karolskolasinski.swing_game_er.panels.ResetButtonPanel;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ResetButton extends JButton implements ActionListener {
    private static final String RESET_TEXT = "⟲";
    private static final Font FONT = new Font(Font.SANS_SERIF, Font.PLAIN, 33);
    private static final int ARROW_BUTTON_SIZE_VERTICAL = 60;
    private static final int ARROW_BUTTON_SIZE_HORIZONTAL = 60;
    private static final Dimension ARROW_DIMENSION = new Dimension(ARROW_BUTTON_SIZE_HORIZONTAL, ARROW_BUTTON_SIZE_VERTICAL);
    private IResetPanel resetPanel;

    public ResetButton(ResetButtonPanel resetButtonPanel) {
        this.resetPanel = resetButtonPanel;
        setText(RESET_TEXT);
        setFont(FONT);
        setFocusable(false);
        setRolloverEnabled(false);
        setPreferredSize(ARROW_DIMENSION);
        addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        resetPanel.reset();
    }

}
