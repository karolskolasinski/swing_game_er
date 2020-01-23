package pl.karolskolasinski.model_factory.button;

import java.awt.*;

public abstract class ButtonFacory {

    public static Button createArrowDownButton(int x, int y, int width, int height) {
        Button button = new Button("\uD83D\uDD3B");
        button.setForeground(Color.RED);
        return parametrizeButton(x, y, width, height, true, button);
    }

    public static Button createArrowUpButton(int x, int y, int width, int height) {
        Button button = new Button("\uD83D\uDD3A");
        button.setForeground(Color.GREEN);
        return parametrizeButton(x, y, width, height, true, button);
    }

    public static Button createBlankButton(int x, int y, int width, int height) {
        Button button = new Button("");
        return parametrizeButton(x, y, width, height, false, button);
    }

    public static Button createRestetButton(int x, int y, int width, int height) {
        Button button = new Button("\uD83D\uDD04");
        button.setForeground(Color.DARK_GRAY);
        return parametrizeButton(x, y, width, height, true, button);
    }


    public static Button createOpenLinkButton(int x, int y, int width, int height) {
        Button button = new Button("OPEN");
        button.setForeground(Color.DARK_GRAY);
        button.setVisible(false);
        return parametrizeButton(x, y, width, height, true, button);
    }

    private static Button parametrizeButton(int x, int y, int width, int height, boolean isEnabled, Button button) {
        button.setFont(button.BUTTON_FONT);
        button.setFocusable(false);
        button.setEnabled(isEnabled);
        button.setRolloverEnabled(false);
        button.setBounds(x, y, width, height);
        return button;
    }

}
