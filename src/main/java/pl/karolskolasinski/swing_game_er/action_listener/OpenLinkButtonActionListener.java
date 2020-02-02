//package pl.karolskolasinski.swing_game_er.action_listener;
//
//import javax.swing.*;
//import java.awt.*;
//import java.net.MalformedURLException;
//import java.net.URI;
//import java.net.URISyntaxException;
//import java.net.URL;
//
//public class OpenLinkButtonActionListener {
//
//    public OpenLinkButtonActionListener(JButton openLinkJButton) {
//        openLinkJButton.addActionListener(e -> {
//            try {
//                openWebpage(new URL("https://hextoopen.blogspot.com/"));
//            } catch (MalformedURLException mURLe) {
//                System.err.println(mURLe.getMessage());
//            }
//        });
//    }
//
//    private void openWebpage(URL url) {
//        try {
//            openWebpage(url.toURI());
//        } catch (URISyntaxException URIse) {
//            System.err.println(URIse.getMessage());
//        }
//    }
//
//    private void openWebpage(URI uri) {
//        Desktop desktop = Desktop.isDesktopSupported() ? Desktop.getDesktop() : null;
//        if (desktop != null && desktop.isSupported(Desktop.Action.BROWSE)) {
//            try {
//                desktop.browse(uri);
//            } catch (Exception e) {
//                System.err.println(e.getMessage());
//            }
//        }
//    }
//
//}
//
