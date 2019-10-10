package pl.karolskolasinski.Components.Panels;

import pl.karolskolasinski.Components.Frame.ContentJFrame;

import javax.swing.*;

public class RightPanel {
    private JPanel rightPanel = new JPanel();

    public RightPanel(ContentJFrame contentJFrame, ResetPanel resetPanel, LeftPanel leftPanel) {
        /*rightPanel*/
        rightPanel.setBorder(BorderFactory.createTitledBorder("Get the code"));
        rightPanel.setBounds(
                250,
                resetPanel.getResetPanel().getHeight(),
                contentJFrame.getjFrame().getRootPane().getWidth() - 250,
                leftPanel.getLeftPanel().getHeight() - resetPanel.getResetPanel().getHeight()
        );
    }

    public JPanel getRightPanel() {
        return rightPanel;
    }
}
