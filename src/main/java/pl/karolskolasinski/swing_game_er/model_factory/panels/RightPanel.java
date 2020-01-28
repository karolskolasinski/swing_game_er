package pl.karolskolasinski.swing_game_er.model_factory.panels;

import javax.swing.*;
import java.awt.*;

public class RightPanel extends JPanel {

    public RightPanel(LeftPanel leftPanel) {
        setLayout(new BorderLayout());
        createResetPanel(leftPanel);
        createCodePanel(leftPanel);
    }

    private void createResetPanel(LeftPanel leftPanel) {
        add(new ResetPanel(leftPanel), BorderLayout.NORTH);
    }

    private void createCodePanel(LeftPanel leftPanel) {
        add(new CodePanel(leftPanel), BorderLayout.CENTER);
    }


}
