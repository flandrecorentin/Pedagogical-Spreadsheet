package com.spreadsheet.pedagogicalspreadsheet.controller;

import com.spreadsheet.pedagogicalspreadsheet.view.Window;

// ****** Interface for transitions between States ********
public interface State {



    public default void displayParameterWindow(Controller c, Window w){};

    public default void displayHomeWindow(Controller c, Window w){};
}
