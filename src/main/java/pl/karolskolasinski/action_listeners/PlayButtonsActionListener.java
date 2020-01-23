package pl.karolskolasinski.action_listeners;

import pl.karolskolasinski.model.button.jbuttons_settings.JButtonsSettings;
import pl.karolskolasinski.model.label.HexCodeJLabel;
import pl.karolskolasinski.model.button.ArrowJButtons;
import pl.karolskolasinski.game_controller.GameStatusChecker;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PlayButtonsActionListener {
    private GameStatusChecker gameStatusChecker = new GameStatusChecker();
    private JButtonsSettings jButtonsSettings = new JButtonsSettings();

    public PlayButtonsActionListener(ArrowJButtons arrowJButtons, HexCodeJLabel hexCodeJLabel) {
        for (int i = 0; i < arrowJButtons.getjButtons().length; i++) {
            arrowJButtons.getjButtons()[i].addActionListener(arrowButtonsAction(arrowJButtons.getjButtons()[i], arrowJButtons, i, hexCodeJLabel));
        }
    }

    private ActionListener arrowButtonsAction(JButton jButton, ArrowJButtons arrowJButtons, int i, HexCodeJLabel hexCodeJLabel) {
        return new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                if (jButton.getText().equals(jButtonsSettings.getDOWN())) {
                    moveDown(jButton, arrowJButtons, i);
                    gameStatusChecker.checkGameStatus(arrowJButtons, hexCodeJLabel);
                } else if (jButton.getText().equals(jButtonsSettings.getUP())) {
                    moveUp(jButton, arrowJButtons, i);
                    gameStatusChecker.checkGameStatus(arrowJButtons, hexCodeJLabel);
                }
            }

            private void moveUp(JButton jButton, ArrowJButtons arrowJButtons, int i) {
                try {
                    if (arrowJButtons.getjButtons()[i - 1].getText().equals("")) {
                        jButtonsSettings.blankButtonSettings(jButton);
                        jButtonsSettings.arrowUpButtonSettings(arrowJButtons.getjButtons()[i - 1]);
                    } else if (arrowJButtons.getjButtons()[i - 1].getText().equals(jButtonsSettings.getDOWN()) && arrowJButtons.getjButtons()[i - 2].getText().equals("")) {
                        jButtonsSettings.blankButtonSettings(jButton);
                        jButtonsSettings.arrowUpButtonSettings(arrowJButtons.getjButtons()[i - 2]);
                    }
                } catch (ArrayIndexOutOfBoundsException e) {
                    System.err.println(e.getMessage());
                }
            }

            private void moveDown(JButton jButton, ArrowJButtons arrowJButtons, int i) {
                try {
                    if (arrowJButtons.getjButtons()[i + 1].getText().equals("")) {
                        jButtonsSettings.blankButtonSettings(jButton);
                        jButtonsSettings.arrowDownButtonSettings(arrowJButtons.getjButtons()[i + 1]);
                    } else if (arrowJButtons.getjButtons()[i + 1].getText().equals(jButtonsSettings.getUP()) && arrowJButtons.getjButtons()[i + 2].getText().equals("")) {
                        jButtonsSettings.blankButtonSettings(jButton);
                        jButtonsSettings.arrowDownButtonSettings(arrowJButtons.getjButtons()[i + 2]);
                    }
                } catch (ArrayIndexOutOfBoundsException e) {
                    System.err.println(e.getMessage());
                }
            }
        };
    }
}
