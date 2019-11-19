package pl.karolskolasinski.GameController;

import pl.karolskolasinski.Model.Button.JButtonsSettings.JButtonsSettings;
import pl.karolskolasinski.Model.Label.HexCodeJLabel;
import pl.karolskolasinski.Model.Button.ArrowJButtons;

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
