package com.spreadsheet.pedagogicalspreadsheet.controller;

import com.spreadsheet.pedagogicalspreadsheet.view.Window;

import java.io.IOException;

// ****** Interface for transitions between States ********
public interface State {



    public default void displayParameterWindow(Controller c, Window w) throws IOException {};

    public default void displayHomeWindow(Controller c, Window w){};
}
