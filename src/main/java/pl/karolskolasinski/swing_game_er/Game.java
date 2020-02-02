package pl.karolskolasinski.swing_game_er;

import pl.karolskolasinski.swing_game_er.core_frame.ContentJFrame;

import java.awt.*;

public class Game {
    public static void main(String[] args) {
        /*Create and display JFrame*/
        EventQueue.invokeLater(() -> new ContentJFrame().setVisible(true));
    }
}
