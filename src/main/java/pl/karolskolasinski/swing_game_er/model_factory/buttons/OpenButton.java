package pl.karolskolasinski.swing_game_er.model_factory.buttons;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;

public class OpenButton extends JButton implements ActionListener {
    private static final String RESET_TEXT = "OPEN";
    private static final String WEBPAGE = "https://hextoopen.blogspot.com/";
    private static final Font FONT = new Font(Font.SANS_SERIF, Font.PLAIN, 20);
    private static final int ARROW_BUTTON_SIZE_VERTICAL = 35;
    private static final int ARROW_BUTTON_SIZE_HORIZONTAL = 150;
    private static final Dimension ARROW_DIMENSION = new Dimension(ARROW_BUTTON_SIZE_HORIZONTAL, ARROW_BUTTON_SIZE_VERTICAL);

    public OpenButton() {
        setText(RESET_TEXT);
        setFont(FONT);
        setFocusable(false);
        setRolloverEnabled(false);
        setPreferredSize(ARROW_DIMENSION);
        setVisible(false);
        addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        try {
            openWebpage(new URL(WEBPAGE));
        } catch (MalformedURLException mURLe) {
            System.err.println(mURLe.getMessage());
        }
    }

    private void openWebpage(URL url) {
        try {
            openWebpage(url.toURI());
        } catch (URISyntaxException URIse) {
            System.err.println(URIse.getMessage());
        }
    }

    private void openWebpage(URI uri) {
        Desktop desktop = Desktop.isDesktopSupported() ? Desktop.getDesktop() : null;
        if (desktop != null && desktop.isSupported(Desktop.Action.BROWSE)) {
            try {
                desktop.browse(uri);
            } catch (Exception e) {
                System.err.println(e.getMessage());
            }
        }
    }

}
