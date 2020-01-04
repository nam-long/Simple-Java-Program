package com.simple.program.state.action;

import com.simple.program.state.Pane;
import com.simple.program.state.State;
import com.simple.program.state.StateManager;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ActionState extends Pane {

    private static final String TAG = ActionState.class.getName();

    private JPanel rootPanel;
    private JButton backButton;

    public ActionState() {
        setComponent(rootPanel);
        backButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                onBackClicked(e);
            }
        });
    }

    @Override
    public void onPaneOpened() {
        System.out.println(TAG + " - onPaneOpened");
    }

    @Override
    public void onPaneClosed() {
        System.out.println(TAG + " - onPaneClosed");
    }

    private void onBackClicked(ActionEvent e) {
        StateManager.getInstance().show(State.MAIN);
    }
}
