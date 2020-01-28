package pl.karolskolasinski.swing_game_er.model_factory.panels;

import pl.karolskolasinski.swing_game_er.model_factory.buttons.ArrowButton;
import pl.karolskolasinski.swing_game_er.model_factory.buttons.ButtonType;
import pl.karolskolasinski.swing_game_er.model_factory.interfaces.IPlayPanel;

import javax.swing.*;
import java.awt.*;

public class LeftButtonsPanel extends JPanel implements IPlayPanel {
    private ArrowButton[] arrowButtons = new ArrowButton[7];

    LeftButtonsPanel() {
        setLayout(new GridLayout(7, 1, 0, 1));
        addButtonsToArray();
        addAll();
    }

    void addAll() {
        removeAll();
        for (ArrowButton arrowButton : arrowButtons) {
            if (arrowButton != null) {
                add(arrowButton);
            }
        }
    }

    void addButtonsToArray() {
        arrowButtons[0] = createDownButton();   // arrow up
        arrowButtons[1] = createDownButton();   // arrow up
        arrowButtons[2] = createDownButton();   // arrow up
        arrowButtons[3] = createEmptyButton();  // empty field
        arrowButtons[4] = createUpButton();     // arrow down
        arrowButtons[5] = createUpButton();     // arrow down
        arrowButtons[6] = createUpButton();     // arrow down
    }

    private ArrowButton createDownButton() {
        return new ArrowButton(this, ButtonType.DOWN);
    }

    private ArrowButton createEmptyButton() {
        return new ArrowButton(this, ButtonType.NONE);
    }

    private ArrowButton createUpButton() {
        return new ArrowButton(this, ButtonType.UP);
    }

    @Override
    public void moveDown(ArrowButton arrowButton) {
        int position = findPosition(arrowButton);
        move(position, position + 1, position + 2, ButtonType.UP);
        addAll();
        revalidate();
        repaint();
    }

    @Override
    public void moveUp(ArrowButton arrowButton) {
        int position = findPosition(arrowButton);
        move(position, position - 1, position - 2, ButtonType.DOWN);
        addAll();
        revalidate();
        repaint();
    }

    private int findPosition(ArrowButton arrowButton) {
        for (int i = 0; i < arrowButtons.length; i++) {
            if (arrowButtons[i] == arrowButton) {
                return i;
            }
        }
        throw new UnsupportedOperationException("Arrow button not found.");
    }

    private void move(int position, int positionStep1, int positionStep2, ButtonType buttonType) {
        try {
            if (arrowButtons[positionStep1].getButtonType() == ButtonType.NONE) {
                ArrowButton tmp = arrowButtons[position];
                ArrowButton changed = arrowButtons[positionStep1];
                arrowButtons[position] = changed;
                arrowButtons[positionStep1] = tmp;
            } else if (arrowButtons[positionStep1].getButtonType() == buttonType
                    && arrowButtons[positionStep2].getButtonType() == ButtonType.NONE) {
                ArrowButton tmp = arrowButtons[position];
                ArrowButton changed = arrowButtons[positionStep2];
                arrowButtons[position] = changed;
                arrowButtons[positionStep2] = tmp;
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            System.err.println(e.getMessage());
        }
    }

}
