package pl.karolskolasinski.action_listeners;

import pl.karolskolasinski.model.button.ArrowJButtons;
import pl.karolskolasinski.model.button.jbuttons_settings.JButtonsSettings;
import pl.karolskolasinski.model.button.OpenLinkJButton;
import pl.karolskolasinski.model.button.ResetJButton;
import pl.karolskolasinski.model.label.HexCodeJLabel;
import pl.karolskolasinski.model.text_field.ResultTextField;

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
