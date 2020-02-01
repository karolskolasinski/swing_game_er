package pl.karolskolasinski.swing_game_er.model_factory.buttons;

import pl.karolskolasinski.swing_game_er.model_factory.interfaces.IOpenButton;
import pl.karolskolasinski.swing_game_er.model_factory.panels.CodeComponentsPanel;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class OpenButton extends JButton implements ActionListener {
    private static final String RESET_TEXT = "OPEN";
    private static final Font FONT = new Font(Font.SANS_SERIF, Font.PLAIN, 20);
    private static final int ARROW_BUTTON_SIZE_VERTICAL = 35;
    private static final int ARROW_BUTTON_SIZE_HORIZONTAL = 150;
    private static final Dimension ARROW_DIMENSION = new Dimension(ARROW_BUTTON_SIZE_HORIZONTAL, ARROW_BUTTON_SIZE_VERTICAL);
    private IOpenButton openPanel;
    private boolean isVisible = false;

    public OpenButton(CodeComponentsPanel codeComponentPanel) {
        this.openPanel = codeComponentPanel;
        setText(RESET_TEXT);
        setFont(FONT);
        setFocusable(false);
        setRolloverEnabled(false);
        setPreferredSize(ARROW_DIMENSION);
        setVisible(isVisible);
        addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        openPanel.openLink(this);
//            GameStatusChecker.checkGameStatus(arrowJButtons, hexCodeJLabel);
    }
}
