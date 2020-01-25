package pl.karolskolasinski.swing_game_er.action_listener;

import pl.karolskolasinski.swing_game_er.game_controller.GameStatusChecker;
import pl.karolskolasinski.swing_game_er.model_factory.ButtonFacory;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PlayButtonsActionListener {

    private GameStatusChecker gameStatusChecker = new GameStatusChecker();

    public PlayButtonsActionListener(JButton[] arrowJButtons, JLabel hexCodeJLabel) {
        for (int i = 0; i < arrowJButtons.length; i++) {
            arrowJButtons[i].addActionListener(arrowButtonsAction(arrowJButtons[i], arrowJButtons, i, hexCodeJLabel));
        }
    }

    private ActionListener arrowButtonsAction(JButton jButton, JButton[] arrowJButtons, int i, JLabel hexCodeJLabel) {
        return new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                if (jButton.getText().equals(ButtonFacory.getDOWN())) {
                    moveDown(jButton, arrowJButtons, i);
                    gameStatusChecker.checkGameStatus(arrowJButtons, hexCodeJLabel);
                } else if (jButton.getText().equals(ButtonFacory.getUP())) {
                    moveUp(jButton, arrowJButtons, i);
                    gameStatusChecker.checkGameStatus(arrowJButtons, hexCodeJLabel);
                }
            }

            private void moveUp(JButton jButton, JButton[] arrowJButtons, int i) {
                try {
                    if (arrowJButtons[i - 1].getText().equals("")) {
                        ButtonFacory.paintBlankButton(jButton);
                        ButtonFacory.paintArrowUpButton(arrowJButtons[i - 1]);
                    } else if (arrowJButtons[i - 1].getText().equals(ButtonFacory.getDOWN())
                            && arrowJButtons[i - 2].getText().equals("")) {
                        ButtonFacory.paintBlankButton(jButton);
                        ButtonFacory.paintArrowUpButton(arrowJButtons[i - 2]);
                    }
                } catch (ArrayIndexOutOfBoundsException e) {
                    System.err.println(e.getMessage());
                }
            }

            private void moveDown(JButton jButton, JButton[] arrowJButtons, int i) {
                try {
                    if (arrowJButtons[i + 1].getText().equals("")) {
                        ButtonFacory.paintBlankButton(jButton);
                        ButtonFacory.paintArrowDownButton(arrowJButtons[i + 1]);
                    } else if (arrowJButtons[i + 1].getText().equals(ButtonFacory.getUP())
                            && arrowJButtons[i + 2].getText().equals("")) {
                        ButtonFacory.paintBlankButton(jButton);
                        ButtonFacory.paintArrowDownButton(arrowJButtons[i + 2]);
                    }
                } catch (ArrayIndexOutOfBoundsException e) {
                    System.err.println(e.getMessage());
                }
            }
        };
    }

}
