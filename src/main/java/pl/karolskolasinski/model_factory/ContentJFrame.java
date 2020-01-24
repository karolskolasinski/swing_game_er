package pl.karolskolasinski.model_factory;

import javax.swing.*;
import java.awt.*;

public class ContentJFrame extends JFrame {

    public ContentJFrame() {
        /*jFrame size&location settings (size first!)*/
        this.setSize(500, 580);
        this.setLocation((int) (Toolkit.getDefaultToolkit().getScreenSize().getWidth() / 2 - this.getWidth() / 2), 100);

        /*jFrame title*/
        this.setTitle("Get a secret code to open the safe.");

        /*jFrame behavior settings*/
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        this.setResizable(false);

        /*jFrame visual settings*/
        this.setIconImage(Toolkit.getDefaultToolkit().getImage(this.getClass().getClassLoader().getResource("icons8-safe-16.png")));

        /*setVisible (last!)*/
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

    public JFrame getjFrame() {
        return this;
    }
}
