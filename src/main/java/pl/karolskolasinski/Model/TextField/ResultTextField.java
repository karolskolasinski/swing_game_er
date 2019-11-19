package pl.karolskolasinski.Model.TextField;

import pl.karolskolasinski.Model.Panel.LeftPanel;
import pl.karolskolasinski.Model.Panel.ResetPanel;

import javax.swing.*;
import java.awt.*;

public class ResultTextField extends JLabel {
    private JTextField jTextField = new JTextField();

    public ResultTextField(LeftPanel leftPanel, ResetPanel resetPanel) {
        jTextField.setBorder(BorderFactory.createEtchedBorder());
        jTextField.setBounds(leftPanel.getLeftPanel().getWidth() + ((resetPanel.getResetPanel().getWidth() / 2) - 75), 327, 150, 50);
        jTextField.setHorizontalAlignment(CENTER);
        jTextField.setFont(new Font(Font.MONOSPACED, Font.PLAIN, 26));
    }

    public JTextField getjTextField() {
        return jTextField;
    }
}
