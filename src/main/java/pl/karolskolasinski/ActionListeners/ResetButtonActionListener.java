package pl.karolskolasinski.ActionListeners;

import pl.karolskolasinski.Model.Button.ArrowJButtons;
import pl.karolskolasinski.Model.Button.JButtonsSettings.JButtonsSettings;
import pl.karolskolasinski.Model.Button.OpenLinkJButton;
import pl.karolskolasinski.Model.Button.ResetJButton;
import pl.karolskolasinski.Model.Label.HexCodeJLabel;
import pl.karolskolasinski.Model.TextField.ResultTextField;

import java.awt.event.ActionListener;


public class ResetButtonActionListener {
    private JButtonsSettings jButtonsSettings = new JButtonsSettings();

    public ResetButtonActionListener(ResetJButton resetJButton, ArrowJButtons arrowJButtons, HexCodeJLabel codeLabel, OpenLinkJButton openLinkJButton, ResultTextField resultTextField) {
        resetJButton.getResetButton().addActionListener(resetButtonsAction(arrowJButtons, codeLabel, openLinkJButton, resultTextField));
    }

    private ActionListener resetButtonsAction(ArrowJButtons arrowJButtons, HexCodeJLabel codeLabel, OpenLinkJButton openLinkJButton, ResultTextField resultTextField) {
        return e -> {
            for (int i = 0; i < 3; i++) {
                jButtonsSettings.arrowDownButtonSettings(arrowJButtons.getjButtons()[i]);
            }
            for (int i = 4; i < 7; i++) {
                jButtonsSettings.arrowUpButtonSettings(arrowJButtons.getjButtons()[i]);
            }
            jButtonsSettings.blankButtonSettings(arrowJButtons.getjButtons()[3]);
            codeLabel.getCodeLabel().setText("<html><span style='font-family: monospace;'>#HEX</span></html>");
            openLinkJButton.getOpenLinkJButton().setVisible(false);
            resultTextField.getjTextField().setText("");
        };
    }
}
