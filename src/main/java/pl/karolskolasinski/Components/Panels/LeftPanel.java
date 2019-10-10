package pl.karolskolasinski.Components.Panels;

import pl.karolskolasinski.Components.Frame.ContentJFrame;

import javax.swing.*;

public class LeftPanel {
    private JPanel leftPanel = new JPanel();

    public LeftPanel(ContentJFrame contentJFrame) {
        /*leftPanel*/
        leftPanel.setBorder(BorderFactory.createTitledBorder("Play this game"));
        leftPanel.setBounds(
                0,
                0,
                250,
                contentJFrame.getjFrame().getRootPane().getHeight()
        );
    }

    public JPanel getLeftPanel() {
        return leftPanel;
    }
}
