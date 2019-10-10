package pl.karolskolasinski.GameController;

import pl.karolskolasinski.Components.Buttons.JButtonsSettings.JButtonsSettings;
import pl.karolskolasinski.Components.Labels.HexCodeJLabel;
import pl.karolskolasinski.Components.Buttons.ArrowJButtons;

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
            hexCodeJLabel.getCodeLabel().setText("#CCCCCC");
        }
    }
}
