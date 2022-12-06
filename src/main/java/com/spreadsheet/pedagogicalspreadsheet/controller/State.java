package com.spreadsheet.pedagogicalspreadsheet.controller;

import com.spreadsheet.pedagogicalspreadsheet.view.Window;

import java.io.IOException;

// ****** Interface for transitions between States ********
public interface State {



    default void displayParameterWindow(Controller c) throws IOException {};

    default void displayHomeWindow(Controller c){};
}
