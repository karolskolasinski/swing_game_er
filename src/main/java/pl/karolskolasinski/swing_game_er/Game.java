package pl.karolskolasinski.swing_game_er;

import pl.karolskolasinski.swing_game_er.action_listener.PlayButtonsActionListener;
import pl.karolskolasinski.swing_game_er.action_listener.ResultTextFieldActionListener;
import pl.karolskolasinski.swing_game_er.action_listener.OpenLinkButtonActionListener;
import pl.karolskolasinski.swing_game_er.action_listener.ResetButtonActionListener;
import pl.karolskolasinski.swing_game_er.model_factory.*;

import javax.swing.*;
import java.awt.*;

public class Game {
    public static void main(String[] args) {

        /*Create and display JFrame*/
        EventQueue.invokeLater(() -> new ContentJFrame().setVisible(true));

//        /*create JFrame*/
//        ContentJFrame contentJFrame = new ContentJFrame();
//
//        /*Get Container*/
//        Container contentPane = contentJFrame.getjFrame().getContentPane();
//
//        /*Create JPanels*/
//        JPanel leftPanel = PanelFacotry.createLeftPanel(0, 0, 250, contentJFrame.getjFrame().getRootPane().getHeight());
//        JPanel resetPanel = PanelFacotry.createResetPanel(250, 0, contentJFrame.getjFrame().getRootPane().getWidth() - 250, 120);
//        JPanel rightPanel = PanelFacotry.createRightPanel(250,
//                resetPanel.getHeight(),
//                contentJFrame.getjFrame().getRootPane().getWidth() - 250,
//                leftPanel.getHeight() - resetPanel.getHeight());
//
//        /*
//        Create JButtons:
//        -1 for arrowDown button;
//        0 for blank button;
//        1 for arrowUp button
//        2 for reset button
//        3 for openLink button
//        */
//        int lpd2 = leftPanel.getWidth() / 2 - 30;
//
//        JButton arrowDownButton1 = makeButton(-1, lpd2, 30, 60, 60);
//        JButton arrowDownButton2 = makeButton(-1, lpd2, 100, 60, 60);
//        JButton arrowDownButton3 = makeButton(-1, lpd2, 170, 60, 60);
//        JButton blankButton = makeButton(0, lpd2, 240, 60, 60);
//        JButton arrowUpButton1 = makeButton(1, lpd2, 310, 60, 60);
//        JButton arrowUpButton2 = makeButton(1, lpd2, 380, 60, 60);
//        JButton arrowUpButton3 = makeButton(1, lpd2, 450, 60, 60);
//        JButton restetButton = makeButton(2, leftPanel.getWidth() + ((resetPanel.getWidth() / 2) - 30), 30, 60, 60);
//        JButton openLinkButton = makeButton(3, leftPanel.getWidth() + ((resetPanel.getWidth() / 2) - 75), 375, 150, 50);
//
//        JButton[] jButtons = new JButton[]{arrowDownButton1, arrowDownButton2, arrowDownButton3, blankButton, arrowUpButton1, arrowUpButton2, arrowUpButton3};
//
//        /*Create JLabels*/
//        JLabel hexCodeLabel = LabelFactory.createHexCodeLabel(leftPanel.getWidth() + ((resetPanel.getWidth() / 2) - 75), 220, 150, 50);
//        JLabel redCodeLabel = LabelFactory.createRedCodeLabel(leftPanel.getWidth() + ((resetPanel.getWidth() / 2) - 75), 249, 150, 50);
//        JLabel greenCodeLabel = LabelFactory.createGreenCodeLabel(leftPanel.getWidth() + ((resetPanel.getWidth() / 2) - 75), 278, 150, 50);
//
//        /*Create JTextField*/
//        ResultTextField resultTextField = new ResultTextField(leftPanel, resetPanel);
//
//
//        /*Add Components to Content Pane*/
//        addComponentsToContentPane(
//                contentPane,
//                arrowDownButton1,
//                arrowDownButton2,
//                arrowDownButton3,
//                blankButton,
//                arrowUpButton1,
//                arrowUpButton2,
//                arrowUpButton3,
//                restetButton,
//                hexCodeLabel,
//                redCodeLabel,
//                greenCodeLabel,
//                resultTextField,
//                openLinkButton,
//                leftPanel,
//                resetPanel,
//                rightPanel
//        );
//
//        /*Set Look And Feel*/
//        contentJFrame.setLookAndFeel(contentJFrame);
//
//        /*Create Action Listeners*/
//        new PlayButtonsActionListener(jButtons, hexCodeLabel);
//        new ResetButtonActionListener(restetButton, jButtons, hexCodeLabel, openLinkButton, resultTextField);
//        new ResultTextFieldActionListener(resultTextField, openLinkButton);
//        new OpenLinkButtonActionListener(openLinkButton);
    }
//
//    private static JButton makeButton(int type, int x, int y, int width, int height) {
//        JButton jButton = new JButton();
//        switch (type) {
//            case -1:
//                ButtonFacory.paintArrowDownButton(jButton);
//                break;
//            case 0:
//                ButtonFacory.paintBlankButton(jButton);
//                break;
//            case 1:
//                ButtonFacory.paintArrowUpButton(jButton);
//                break;
//            case 2:
//                ButtonFacory.paintRestetButton(jButton);
//                break;
//            case 3:
//                ButtonFacory.paintOpenLinkButton(jButton);
//                break;
//        }
//        ButtonFacory.boundsSetter(jButton, x, y, width, height);
//        return jButton;
//    }
////
//    private static void addComponentsToContentPane(Container contentPane, Component... components) {
//        for (Component component : components) {
//            contentPane.add(component);
//        }
//    }

}
