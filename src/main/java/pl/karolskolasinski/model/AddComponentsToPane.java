package pl.karolskolasinski.model;

import java.awt.*;

public class AddComponentsToPane {

    /**
     * adding components to container (ContentPane)
     *
     * @param container - ContentPane of jFrame
     * @param jButtons  - buttons: playing buttons + reset button
     * @param component - left side panel, small right upper panel, large right panel
     */
    public void addComponentsToPane(Container container, Component[] jButtons, Component... component) {

        for (Component jButton : jButtons) {
            container.add(jButton);
        }

        for (Component components : component) {
            container.add(components);
        }
    }
}
