package pl.karolskolasinski.model_factory.button;

import lombok.AllArgsConstructor;

import javax.swing.*;
import java.awt.*;

@AllArgsConstructor
public class Button extends JButton {
    final Font BUTTON_FONT = new Font(Font.SANS_SERIF, Font.PLAIN, 20);
    final String TEXT;
}
