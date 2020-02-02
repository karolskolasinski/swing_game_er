package pl.karolskolasinski.swing_game_er.buttons;

import pl.karolskolasinski.swing_game_er.interfaces.IPlayPanel;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ArrowButton extends JButton implements ActionListener {
    private static final String DOWN_TEXT = "\uD83D\uDD3B";
    private static final String UP_TEXT = "\uD83D\uDD3A";
    private static final Color DOWN_COLOR = Color.RED;
    private static final Color UP_COLOR = Color.GREEN;
    private static final Font FONT = new Font(Font.SANS_SERIF, Font.PLAIN, 20);
    private static final int ARROW_BUTTON_SIZE_VERTICAL = 60;
    private static final int ARROW_BUTTON_SIZE_HORIZONTAL = 60;
    private static final Dimension ARROW_DIMENSION = new Dimension(ARROW_BUTTON_SIZE_HORIZONTAL, ARROW_BUTTON_SIZE_VERTICAL);
    private IPlayPanel playPanel;
    private ButtonType buttonType;

    public ButtonType getButtonType() {
        return buttonType;
    }

    public ArrowButton(IPlayPanel playPanel, ButtonType buttonType) {
        this.playPanel = playPanel;
        this.buttonType = buttonType;
        if (buttonType == ButtonType.DOWN) {
            setText(DOWN_TEXT);
            setForeground(DOWN_COLOR);
        } else if (buttonType == ButtonType.UP) {
            setText(UP_TEXT);
            setForeground(UP_COLOR);
        } else if (buttonType == ButtonType.NONE) {
            setEnabled(false);
        }
        setFont(FONT);
        setFocusable(false);
        setRolloverEnabled(false);
        setPreferredSize(ARROW_DIMENSION);
        addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (buttonType == ButtonType.DOWN) {
            playPanel.moveDown(this);
        } else if (buttonType == ButtonType.UP) {
            playPanel.moveUp(this);
        }
    }

}

