package pl.karolskolasinski.swing_game_er.core_frame;

import pl.karolskolasinski.swing_game_er.panels.LeftPanel;
import pl.karolskolasinski.swing_game_er.panels.RightPanel;

import javax.swing.*;
import java.awt.*;

public class ContentJFrame extends JFrame {
    private final static int WINDOW_WIDTH = 500;
    private final static int WINDOW_HEIGHT = 500;
    private final static String TITLE = "Get a secret code to open the safe.";
    private final static String ICON_FILE = "icons8-safe-16.png";

    public ContentJFrame() {
        /*jFrame size&location settings (size first!)*/
        this.setSize(WINDOW_WIDTH, WINDOW_HEIGHT);
        this.setLocation((int) (Toolkit.getDefaultToolkit().getScreenSize().getWidth() / 2 - this.getWidth() / 2), 100);

        /*jFrame title*/
        this.setTitle(TITLE);

        /*jFrame behavior settings*/
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        this.setResizable(false);

        /*jFrame visual settings*/
        this.setIconImage(Toolkit.getDefaultToolkit().getImage(this.getClass().getClassLoader().getResource(ICON_FILE)));
        setLayout(new GridLayout());
        /*add panels to JFrame (ContentPane)*/
        LeftPanel leftPanel = new LeftPanel();
        this.getContentPane().add(leftPanel);
        this.getContentPane().add(new RightPanel(leftPanel.getLeftButtonsPanel()));

        /*set visible (visible last!)*/
        this.setVisible(true);
        setLookAndFeel(this);
    }

    private void setLookAndFeel(JFrame jFrame) {
        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
            SwingUtilities.updateComponentTreeUI(jFrame);
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | UnsupportedLookAndFeelException e) {
            System.err.println(e.getMessage());
        }
    }

}
