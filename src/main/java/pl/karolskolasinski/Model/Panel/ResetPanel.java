package pl.karolskolasinski.Model.Panel;

import pl.karolskolasinski.Model.Frame.ContentJFrame;

import javax.swing.*;

public class ResetPanel {
    private JPanel resetPanel = new JPanel();

    public ResetPanel(ContentJFrame contentJFrame) {
        /*resetPanel*/
        resetPanel.setBorder(BorderFactory.createTitledBorder("Reset"));
        resetPanel.setBounds(
                250,
                0,
                contentJFrame.getjFrame().getRootPane().getWidth() - 250,
                120
        );
    }

    public JPanel getResetPanel() {
        return resetPanel;
    }
}