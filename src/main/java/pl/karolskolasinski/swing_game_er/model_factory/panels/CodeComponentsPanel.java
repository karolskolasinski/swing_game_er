package pl.karolskolasinski.swing_game_er.model_factory.panels;

import pl.karolskolasinski.swing_game_er.model_factory.buttons.ArrowButton;
import pl.karolskolasinski.swing_game_er.model_factory.buttons.OpenButton;
import pl.karolskolasinski.swing_game_er.model_factory.game_controller.GameStatusDispatcher;
import pl.karolskolasinski.swing_game_er.model_factory.interfaces.IObserver;
import pl.karolskolasinski.swing_game_er.model_factory.interfaces.IOpenButton;
import pl.karolskolasinski.swing_game_er.model_factory.interfaces.IGameStatusChecker;
import pl.karolskolasinski.swing_game_er.model_factory.labels.LabelType;
import pl.karolskolasinski.swing_game_er.model_factory.labels.TextLabel;
import pl.karolskolasinski.swing_game_er.model_factory.text_fields.ResultTextField;

import javax.swing.*;
import java.awt.*;

public class CodeComponentsPanel extends JPanel implements IOpenButton, IGameStatusChecker, IObserver {
    private ResultTextField resultTextField;
    private OpenButton openButton;
    private TextLabel textLabel;

    CodeComponentsPanel(LeftButtonsPanel leftButtonsPanel) {
        setLayout(new GridLayout(5, 1, 0, 0));
        addAll();
        GameStatusDispatcher.resiterObserver(this);
    }

    private void addAll() {
        add(createHexCodeLabel());
        add(createRedCodeLabel());
        add(createGreenCodeLabel());
        add(createResultTextField());
        add(createOpenButton());
    }

    private ResultTextField createResultTextField() {
        return new ResultTextField();
    }

    private TextLabel createHexCodeLabel() {
        this.textLabel = new TextLabel(LabelType.HEX);
        return textLabel;
    }

    private TextLabel createRedCodeLabel() {
        return new TextLabel(LabelType.RED);
    }

    private TextLabel createGreenCodeLabel() {
        return new TextLabel(LabelType.GREEN);
    }

    private OpenButton createOpenButton() {
        return new OpenButton(this);
    }


    @Override
    public void checkIsCorrect(ArrowButton[] arrowButtons) {

    }

    @Override
    public void checkCode(String code) {

    }

    @Override
    public void openLink(OpenButton openButton) {

    }

    @Override
    public void receiveNotification() {
        textLabel.setText("<html><span style='font-family: monospace;'>#CCCCCC</span></html>");
        textLabel.revalidate();
        textLabel.repaint();
    }

}

