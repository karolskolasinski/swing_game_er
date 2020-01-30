package pl.karolskolasinski.swing_game_er.model_factory.text_fields;

import javax.swing.*;
import java.awt.*;

public class ResultTextField extends JTextField {
    private static final Font FONT = new Font(Font.SANS_SERIF, Font.PLAIN, 26);
    private static final int TEXTFIELD_SIZE_VERTICAL = 35;
    private static final int TEXTFIELD_SIZE_HORIZONTAL = 150;
    private static final Dimension TEXTFIELD_DIMENSION = new Dimension(TEXTFIELD_SIZE_HORIZONTAL, TEXTFIELD_SIZE_VERTICAL);

    public ResultTextField() {
        this.setBorder(BorderFactory.createEtchedBorder());
        this.setHorizontalAlignment(CENTER);
        this.setFont(FONT);
        this.setPreferredSize(TEXTFIELD_DIMENSION);
        this.setDocument(new JTextFieldLimit(7));
    }

}
