package pl.karolskolasinski;

import pl.karolskolasinski.ActionListeners.OpenLinkButtonActionListener;
import pl.karolskolasinski.ActionListeners.PlayButtonsActionListener;
import pl.karolskolasinski.ActionListeners.ResetButtonActionListener;
import pl.karolskolasinski.ActionListeners.ResultTextFieldActionListener;
import pl.karolskolasinski.Model.*;
import pl.karolskolasinski.Model.Button.ArrowJButtons;
import pl.karolskolasinski.Model.Button.OpenLinkJButton;
import pl.karolskolasinski.Model.Button.ResetJButton;
import pl.karolskolasinski.Model.Frame.ContentJFrame;
import pl.karolskolasinski.Model.Label.GreenCodeJLabel;
import pl.karolskolasinski.Model.Label.HexCodeJLabel;
import pl.karolskolasinski.Model.Label.RedCodeJLabel;
import pl.karolskolasinski.Model.Panel.LeftPanel;
import pl.karolskolasinski.Model.Panel.ResetPanel;
import pl.karolskolasinski.Model.Panel.RightPanel;
import pl.karolskolasinski.Model.TextField.ResultTextField;

import java.awt.*;

class Main {
    public static void main(String[] args) {
        new Main();
    }

    private Main() {
        ContentJFrame contentJFrame = new ContentJFrame();
        LeftPanel leftPanel = new LeftPanel(contentJFrame);
        ResetPanel resetPanel = new ResetPanel(contentJFrame);
        RightPanel rightPanel = new RightPanel(contentJFrame, resetPanel, leftPanel);
        ArrowJButtons arrowJButtons = new ArrowJButtons(leftPanel);
        ResetJButton resetJButton = new ResetJButton(leftPanel, resetPanel);
        HexCodeJLabel codeLabel = new HexCodeJLabel(leftPanel, resetPanel);
        RedCodeJLabel redCodeJLabel = new RedCodeJLabel(leftPanel, resetPanel);
        GreenCodeJLabel greenCodeJLabel = new GreenCodeJLabel(leftPanel, resetPanel);
        ResultTextField resultTextField = new ResultTextField(leftPanel, resetPanel);
        OpenLinkJButton openLinkJButton = new OpenLinkJButton(leftPanel, resetPanel);
        Container container = contentJFrame.getjFrame().getContentPane();

        new AddComponentsToPane().addComponentsToPane(
                container,
                arrowJButtons.getjButtons(),
                resetJButton.getResetButton(),
                codeLabel.getCodeLabel(),
                redCodeJLabel.getCodeLabel(),
                greenCodeJLabel.getCodeLabel(),
                resultTextField.getjTextField(),
                openLinkJButton.getOpenLinkJButton(),
                leftPanel.getLeftPanel(),
                resetPanel.getResetPanel(),
                rightPanel.getRightPanel()
        );

        contentJFrame.setLookAndFeel();

        new PlayButtonsActionListener(arrowJButtons, codeLabel);
        new ResetButtonActionListener(resetJButton, arrowJButtons, codeLabel, openLinkJButton, resultTextField);
        new ResultTextFieldActionListener(resultTextField, openLinkJButton);
        new OpenLinkButtonActionListener(openLinkJButton);
    }
}
