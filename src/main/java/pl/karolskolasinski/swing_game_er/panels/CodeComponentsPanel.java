package pl.karolskolasinski.swing_game_er.panels;

import pl.karolskolasinski.swing_game_er.buttons.OpenButton;
import pl.karolskolasinski.swing_game_er.game_controller.GameStatusDispatcher;
import pl.karolskolasinski.swing_game_er.interfaces.IObserver;
import pl.karolskolasinski.swing_game_er.labels.LabelType;
import pl.karolskolasinski.swing_game_er.labels.TextLabel;
import pl.karolskolasinski.swing_game_er.text_fields.ResultTextField;

import javax.swing.*;
import java.awt.*;

public class CodeComponentsPanel extends JPanel implements IObserver {
    private OpenButton openButton;
    private TextLabel hexLabel;
    private ResultTextField resultTextField;

    CodeComponentsPanel() {
        setLayout(new GridLayout(5, 1, 0, 0));
        addAll();
        GameStatusDispatcher.registerObserver(this);
    }

    private void addAll() {
        add(createHexCodeLabel());
        add(createRedCodeLabel());
        add(createGreenCodeLabel());
        add(createResultTextField());
        add(createOpenButton());
    }

    private TextLabel createHexCodeLabel() {
        hexLabel = new TextLabel(LabelType.HEX);
        return hexLabel;
    }

    private TextLabel createRedCodeLabel() {
        return new TextLabel(LabelType.RED);
    }

    private TextLabel createGreenCodeLabel() {
        return new TextLabel(LabelType.GREEN);
    }

    private ResultTextField createResultTextField() {
        resultTextField = new ResultTextField(this);
        return resultTextField;
    }

    private OpenButton createOpenButton() {
        this.openButton = new OpenButton();
        return openButton;
    }

    @Override
    public void receiveNotificationAboutArrows() {
        hexLabel.setText(TextLabel.getHexAfter());
        hexLabel.revalidate();
        hexLabel.repaint();
    }

    public void changeOpenButtonVisibility(boolean isVisible) {
        openButton.setVisible(isVisible);
        openButton.revalidate();
        openButton.repaint();
    }

    TextLabel getHexLabel() {
        return hexLabel;
    }

    ResultTextField getResultTextField() {
        return resultTextField;
    }

    OpenButton getOpenButton() {
        return openButton;
    }

}

