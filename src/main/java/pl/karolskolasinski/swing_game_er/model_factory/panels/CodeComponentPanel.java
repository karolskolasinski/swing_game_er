package pl.karolskolasinski.swing_game_er.model_factory.panels;

import pl.karolskolasinski.swing_game_er.model_factory.buttons.OpenButton;
import pl.karolskolasinski.swing_game_er.model_factory.interfaces.IOpenPanel;
import pl.karolskolasinski.swing_game_er.model_factory.labels.LabelType;
import pl.karolskolasinski.swing_game_er.model_factory.labels.TextLabel;
import pl.karolskolasinski.swing_game_er.model_factory.text_fields.ResultTextField;

import javax.swing.*;
import java.awt.*;

public class CodeComponentPanel extends JPanel implements IOpenPanel {

    CodeComponentPanel(LeftButtonsPanel leftButtonsPanel) {
        setLayout(new GridLayout(5, 1, 0, 0));
        addAll();
    }

    private void addAll() {
        add(createHexCodeLabel());
        add(createRedCodeLabel());
        add(createGreenCodeLabel());
        add(createResultTextField());
//        add(createOpenButton());
    }

    private JTextField createResultTextField() {
        return new ResultTextField();
    }

    private JLabel createHexCodeLabel() {
        return new TextLabel(LabelType.HEX);
    }

    private JLabel createRedCodeLabel() {
        return new TextLabel(LabelType.RED);
    }

    private JLabel createGreenCodeLabel() {
        return new TextLabel(LabelType.GREEN);
    }

//    private OpenButton createOpenButton() {
//        return new OpenButton(this, ButtonType.OPEN);
//    }


    @Override
    public void openLink(OpenButton openButton) {

    }
}

