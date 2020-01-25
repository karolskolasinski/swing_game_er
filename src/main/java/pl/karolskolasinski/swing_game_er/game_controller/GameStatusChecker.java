package pl.karolskolasinski.swing_game_er.game_controller;

import pl.karolskolasinski.swing_game_er.model_factory.ButtonFacory;

import javax.swing.*;

public class GameStatusChecker {

    public void checkGameStatus(JButton[] jButtonsWatchers, JLabel hexCodeJLabel) {
        if (jButtonsWatchers[0].getText().equals(ButtonFacory.getUP())
                && jButtonsWatchers[1].getText().equals(ButtonFacory.getUP())
                && jButtonsWatchers[2].getText().equals(ButtonFacory.getUP())
                && jButtonsWatchers[4].getText().equals(ButtonFacory.getDOWN())
                && jButtonsWatchers[5].getText().equals(ButtonFacory.getDOWN())
                && jButtonsWatchers[6].getText().equals(ButtonFacory.getDOWN())
        ) {
            hexCodeJLabel.setText("<html><span style='font-family: monospace;'>#CCCCCC</span></html>");
        }
    }

}
