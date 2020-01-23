package pl.karolskolasinski.model.frame;

import javax.swing.*;
import java.awt.*;

public class ContentJFrame {
    private final JFrame jFrame = new JFrame("Get a secret code to open the safe.");

    public ContentJFrame() {
        /*jFrame size&location settings (size first!)*/
        jFrame.setSize(500, 580);
        jFrame.setLocation((int) (Toolkit.getDefaultToolkit().getScreenSize().getWidth() / 2 - jFrame.getWidth() / 2), 100);

        /*jFrame behavior settings*/
        jFrame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        jFrame.setResizable(false);

        /*jFrame visible settings*/
        jFrame.setLayout(null);
        jFrame.setIconImage(Toolkit.getDefaultToolkit().getImage(this.getClass().getClassLoader().getResource("icons8-safe-16.png")));

        /*setVisible (last!)*/
        jFrame.setVisible(true);
    }

    public void setLookAndFeel() {
        try {
            UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel");
            SwingUtilities.updateComponentTreeUI(jFrame);
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | UnsupportedLookAndFeelException e) {
            System.err.println(e.getMessage());
        }
    }

    public JFrame getjFrame() {
        return jFrame;
    }
}
