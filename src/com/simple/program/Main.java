package com.simple.program;

import com.simple.program.view.MainFrame;

import java.awt.*;

public class Main {

    public static void main(String[] args) {
        MainFrame mainFrame = new MainFrame();
        mainFrame.setTitle("Demo Application");
        mainFrame.setPreferredSize(new Dimension(600, 800));
        mainFrame.pack();
        mainFrame.setVisible(true);
    }
}
