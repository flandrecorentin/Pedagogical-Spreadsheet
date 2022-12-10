package com.spreadsheet.pedagogicalspreadsheet.controller;

import com.spreadsheet.pedagogicalspreadsheet.view.Window;

import java.io.IOException;

// ****** Interface for transitions between States ********
public interface State {



    default void displayParameterGlobalWindow(Controller c) throws IOException {};

    default void displayParameterColorWindow(Controller c) {};
    default void displayParameterLanguageWindow(Controller c) {};

    default void displayHomeWindow(Controller c){};
}
