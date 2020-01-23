package pl.karolskolasinski;

import pl.karolskolasinski.action_listeners.OpenLinkButtonActionListener;
import pl.karolskolasinski.action_listeners.PlayButtonsActionListener;
import pl.karolskolasinski.action_listeners.ResetButtonActionListener;
import pl.karolskolasinski.action_listeners.ResultTextFieldActionListener;
import pl.karolskolasinski.model.*;
import pl.karolskolasinski.model.button.ArrowJButtons;
import pl.karolskolasinski.model.button.OpenLinkJButton;
import pl.karolskolasinski.model.button.ResetJButton;
import pl.karolskolasinski.model.frame.ContentJFrame;
import pl.karolskolasinski.model.label.GreenCodeJLabel;
import pl.karolskolasinski.model.label.HexCodeJLabel;
import pl.karolskolasinski.model.label.RedCodeJLabel;
import pl.karolskolasinski.model.panel.LeftPanel;
import pl.karolskolasinski.model.panel.ResetPanel;
import pl.karolskolasinski.model.panel.RightPanel;
import pl.karolskolasinski.model.text_field.ResultTextField;

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
