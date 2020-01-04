package com.simple.program.state;

public interface PaneListener {

    void onPaneOpened();

    void onPaneResume();

    void onPanePaused();

    void onPaneClosed();
}
