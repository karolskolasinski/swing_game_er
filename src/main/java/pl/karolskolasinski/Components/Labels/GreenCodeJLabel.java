package pl.karolskolasinski.Components.Labels;

import pl.karolskolasinski.Components.Panels.LeftPanel;
import pl.karolskolasinski.Components.Panels.ResetPanel;

import javax.swing.*;
import java.awt.*;

public class GreenCodeJLabel extends JLabel {
    private JLabel codeLabel = new JLabel();

    public GreenCodeJLabel(LeftPanel leftPanel, ResetPanel resetPanel) {
        codeLabel.setBorder(null);
        codeLabel.setBounds(leftPanel.getLeftPanel().getWidth() + ((resetPanel.getResetPanel().getWidth() / 2) - 75), 278, 150, 50);
        codeLabel.setHorizontalAlignment(RIGHT);
        codeLabel.setForeground(Color.DARK_GRAY);
        codeLabel.setFont(new Font(Font.SANS_SERIF, Font.PLAIN, 26));
        codeLabel.setText("<html>-5x<span style='font-size: 15px; color: rgb(0, 255, 0);'>\uD83D\uDD3A</span></html>");
    }

    public JLabel getCodeLabel() {
        return codeLabel;
    }
}
