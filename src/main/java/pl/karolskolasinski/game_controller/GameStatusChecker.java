package pl.karolskolasinski.game_controller;

import pl.karolskolasinski.model.button.jbuttons_settings.JButtonsSettings;
import pl.karolskolasinski.model.label.HexCodeJLabel;
import pl.karolskolasinski.model.button.ArrowJButtons;

public class GameStatusChecker {
    private JButtonsSettings jButtonsSettings = new JButtonsSettings();

    public void checkGameStatus(ArrowJButtons jButtonsWatchers, HexCodeJLabel hexCodeJLabel) {
        if (jButtonsWatchers.getjButtons()[0].getText().equals(jButtonsSettings.getUP())
                && jButtonsWatchers.getjButtons()[1].getText().equals(jButtonsSettings.getUP())
                && jButtonsWatchers.getjButtons()[2].getText().equals(jButtonsSettings.getUP())
                && jButtonsWatchers.getjButtons()[4].getText().equals(jButtonsSettings.getDOWN())
                && jButtonsWatchers.getjButtons()[5].getText().equals(jButtonsSettings.getDOWN())
                && jButtonsWatchers.getjButtons()[6].getText().equals(jButtonsSettings.getDOWN())
        ) {
            hexCodeJLabel.getCodeLabel().setText("<html><span style='font-family: monospace;'>#CCCCCC</span></html>");
        }
    }
}
