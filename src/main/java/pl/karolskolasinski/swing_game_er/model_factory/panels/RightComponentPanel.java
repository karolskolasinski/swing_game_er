package pl.karolskolasinski.swing_game_er.model_factory.panels;

import pl.karolskolasinski.swing_game_er.model_factory.buttons.ButtonType;
import pl.karolskolasinski.swing_game_er.model_factory.buttons.OpenButton;
import pl.karolskolasinski.swing_game_er.model_factory.interfaces.IOpenPanel;
import pl.karolskolasinski.swing_game_er.model_factory.labels.LabelType;
import pl.karolskolasinski.swing_game_er.model_factory.labels.TextLabel;

import javax.swing.*;
import java.awt.*;

public class RightComponentPanel extends JPanel implements IOpenPanel {

    RightComponentPanel(LeftPanel leftPanel) {
        setLayout(new GridLayout(5, 1, 0, 0));
        setBackground(Color.magenta);
        addAll();
    }

    private void addAll() {
        add(createHexCodeLabel());
        add(createRedCodeLabel());
        add(createGreenCodeLabel());
//        add(createOpenButton());
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

