package pl.karolskolasinski;

import pl.karolskolasinski.ActionListeners.OpenLinkButtonActionListener;
import pl.karolskolasinski.ActionListeners.PlayButtonsActionListener;
import pl.karolskolasinski.ActionListeners.ResetButtonActionListener;
import pl.karolskolasinski.ActionListeners.ResultTextFieldActionListener;
import pl.karolskolasinski.Components.*;
import pl.karolskolasinski.Components.Buttons.ArrowJButtons;
import pl.karolskolasinski.Components.Buttons.OpenLinkJButton;
import pl.karolskolasinski.Components.Buttons.ResetJButton;
import pl.karolskolasinski.Components.Frame.ContentJFrame;
import pl.karolskolasinski.Components.Labels.GreenCodeJLabel;
import pl.karolskolasinski.Components.Labels.HexCodeJLabel;
import pl.karolskolasinski.Components.Labels.RedCodeJLabel;
import pl.karolskolasinski.Components.Panels.LeftPanel;
import pl.karolskolasinski.Components.Panels.ResetPanel;
import pl.karolskolasinski.Components.Panels.RightPanel;
import pl.karolskolasinski.Components.TextField.ResultTextField;

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
