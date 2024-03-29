package com.spreadsheet.pedagogicalspreadsheet.controller;

import com.spreadsheet.pedagogicalspreadsheet.view.Window;

import java.io.IOException;

// ****** Interface for transitions between States ********
public interface State {


//    *************** HOME AND SETTINGS Transitions *******************
    default void displayParameterGlobalWindow(Controller c) throws IOException {};

    default void displayParameterColorWindow(Controller c) {};
    default void displayParameterLanguageWindow(Controller c) {};

    default void displayHomeWindow(Controller c){};

    default  void createNewSpreadsheetFromZero(Controller c) throws IOException {};

    default void changeColorTheme(Controller c, String newStyle){};

//    *************** HOME AND SETTINGS Transitions *******************
















//    ******************* SPREADSHEET Transitions ************
    default void displayFilePrincipalState(Controller c){};

    default void displayCellPrincipalState(Controller c){};

    default void displayDiagramPrincipalState(Controller c){};

    default void displayGamePrincipalState(Controller c){};

    default void displayHelpPrincipalState(Controller c){};

    default void displayHomeState(Controller c){};

    //    ******************* SPREADSHEET Transitions ************
}
