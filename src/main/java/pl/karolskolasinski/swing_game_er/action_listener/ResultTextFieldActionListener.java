//package pl.karolskolasinski.swing_game_er.action_listener;
//
//import javax.swing.*;
//import java.awt.event.KeyAdapter;
//import java.awt.event.KeyEvent;
//
//public class ResultTextFieldActionListener {
//
//    private final String result = Integer.toHexString(0xcccccc + 3 * 0xFF0000 - 5 * 0x00FF00).toUpperCase();
//
//    public ResultTextFieldActionListener(JTextField resultTextField, JButton openLinkJButton) {
//        resultTextField.addKeyListener(new KeyAdapter() {
//            @Override
//            public void keyReleased(KeyEvent e) {
//                if (resultTextField.getText().equals(result)) {
//                    openLinkJButton.setVisible(true);
//                } else {
//                    openLinkJButton.setVisible(false);
//                }
//            }
//        });
//    }
//
//}
