//package pl.karolskolasinski.swing_game_er.action_listener;
//
//import pl.karolskolasinski.swing_game_er.model_factory.ButtonFacory;
//
//import javax.swing.*;
//import java.awt.event.ActionListener;
//
//
//public class ResetButtonActionListener {
//
//    public ResetButtonActionListener(JButton resetJButton, JButton[] arrowJButtons, JLabel hexCodeLabel, JButton openLinkJButton, JTextField resultTextField) {
//        resetJButton.addActionListener(resetButtonsAction(arrowJButtons, hexCodeLabel, openLinkJButton, resultTextField));
//    }
//
//    private ActionListener resetButtonsAction(JButton[] arrowJButtons, JLabel codeLabel, JButton openLinkJButton, JTextField resultTextField) {
//        return e -> {
//            for (int i = 0; i < 3; i++) {
//                ButtonFacory.paintArrowDownButton(arrowJButtons[i]);
//            }
//            for (int i = 4; i < 7; i++) {
//                ButtonFacory.paintArrowUpButton(arrowJButtons[i]);
//            }
//            ButtonFacory.paintBlankButton(arrowJButtons[3]);
//            codeLabel.setText("<html><span style='font-family: monospace;'>#HEX</span></html>");
//            openLinkJButton.setVisible(false);
//            resultTextField.setText("");
//        };
//    }
//
//}
