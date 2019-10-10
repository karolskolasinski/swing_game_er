package pl.karolskolasinski.Components.Labels;

import pl.karolskolasinski.Components.Panels.LeftPanel;
import pl.karolskolasinski.Components.Panels.ResetPanel;

import javax.swing.*;
import java.awt.*;

public class HexCodeJLabel extends JLabel {
    private JLabel codeLabel = new JLabel();


    public HexCodeJLabel(LeftPanel leftPanel, ResetPanel resetPanel) {
        codeLabel.setBorder(null);
        codeLabel.setBounds(leftPanel.getLeftPanel().getWidth() + ((resetPanel.getResetPanel().getWidth() / 2) - 75), 220, 150, 50);
        codeLabel.setHorizontalAlignment(RIGHT);
        codeLabel.setForeground(Color.DARK_GRAY);
        codeLabel.setFont(new Font(Font.SANS_SERIF, Font.PLAIN, 26));
        codeLabel.setText("#HEX");
    }

    public JLabel getCodeLabel() {
        return codeLabel;
    }
}
