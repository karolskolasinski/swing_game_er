package pl.karolskolasinski.swing_game_er.model_factory;

import javax.swing.*;
import java.awt.*;

public class ResultTextField extends JTextField {

    public ResultTextField(JPanel leftPanel, JPanel resetPanel) {
        this.setBorder(BorderFactory.createEtchedBorder());
        this.setBounds(leftPanel.getWidth() + ((resetPanel.getWidth() / 2) - 75), 327, 150, 50);
        this.setHorizontalAlignment(CENTER);
        this.setFont(new Font(Font.MONOSPACED, Font.PLAIN, 26));
    }

}
