package pl.karolskolasinski.swing_game_er.model_factory.game_controller;

import pl.karolskolasinski.swing_game_er.model_factory.interfaces.IGameStatusChecker;

public class GameStatusChecker implements IGameStatusChecker {
    private boolean isCorrect;

    public GameStatusChecker() {

    }

    @Override
    public void checkCode(String code) {

    }

    public boolean isCorrect() {
        return isCorrect;
    }
}
