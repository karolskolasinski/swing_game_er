package pl.karolskolasinski.action_listeners;

import pl.karolskolasinski.model.button.OpenLinkJButton;
import pl.karolskolasinski.model.text_field.ResultTextField;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class ResultTextFieldActionListener {
    private final String result = Integer.toHexString(0xcccccc + 3 * 0xFF0000 - 5 * 0x00FF00).toUpperCase();

    public ResultTextFieldActionListener(ResultTextField resultTextField, OpenLinkJButton openLinkJButton) {
        resultTextField.getjTextField().addKeyListener(new KeyAdapter() {
            @Override
            public void keyReleased(KeyEvent e) {
                if (resultTextField.getjTextField().getText().equals(result)) {
                    openLinkJButton.getOpenLinkJButton().setVisible(true);
                } else {
                    openLinkJButton.getOpenLinkJButton().setVisible(false);
                }
            }
        });

    }
}
