package pl.karolskolasinski.Components.TextField;

import pl.karolskolasinski.Components.Panels.LeftPanel;
import pl.karolskolasinski.Components.Panels.ResetPanel;

import javax.swing.*;
import java.awt.*;

public class ResultTextField extends JLabel {
    private JTextField jTextField = new JTextField();

    public ResultTextField(LeftPanel leftPanel, ResetPanel resetPanel) {
        jTextField.setBorder(BorderFactory.createEtchedBorder());
        jTextField.setBounds(leftPanel.getLeftPanel().getWidth() + ((resetPanel.getResetPanel().getWidth() / 2) - 75), 327, 150, 50);
        jTextField.setHorizontalAlignment(CENTER);
        jTextField.setFont(new Font(Font.SANS_SERIF, Font.PLAIN, 26));
    }

    public JTextField getjTextField() {
        return jTextField;
    }
}
