package pl.karolskolasinski.swing_game_er.model_factory.game_controller;

import pl.karolskolasinski.swing_game_er.model_factory.buttons.ArrowButton;
import pl.karolskolasinski.swing_game_er.model_factory.buttons.ButtonType;
import pl.karolskolasinski.swing_game_er.model_factory.interfaces.IGameStatusChecker;
import pl.karolskolasinski.swing_game_er.model_factory.interfaces.IObserver;

import java.util.ArrayList;
import java.util.List;

public class GameStatusDispatcher implements IGameStatusChecker {
    private static List<IObserver> observers = new ArrayList<>();

    public static void registerObserver(IObserver iObserver) {
        observers.add(iObserver);
    }

    private void notifyObserversAboutArrowsAreCorrect() {
        observers.forEach(IObserver::receiveNotificationAboutArrows);
    }

    @Override
    public void checkIsCorrect(ArrowButton[] arrowButtons) {
        if (arrowButtons[0].getButtonType().equals(ButtonType.UP)
                && arrowButtons[1].getButtonType().equals(ButtonType.UP)
                && arrowButtons[2].getButtonType().equals(ButtonType.UP)
                && arrowButtons[4].getButtonType().equals(ButtonType.DOWN)
                && arrowButtons[5].getButtonType().equals(ButtonType.DOWN)
                && arrowButtons[6].getButtonType().equals(ButtonType.DOWN)) {
            notifyObserversAboutArrowsAreCorrect();
        }
    }

}
