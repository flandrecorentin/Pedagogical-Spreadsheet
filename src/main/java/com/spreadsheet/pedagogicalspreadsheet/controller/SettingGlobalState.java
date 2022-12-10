package com.spreadsheet.pedagogicalspreadsheet.controller;

import com.spreadsheet.pedagogicalspreadsheet.PedagogicalSpreadsheet;
import com.spreadsheet.pedagogicalspreadsheet.view.Window;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.IOException;

public class SettingGlobalState implements State{
    // Logger for the SettingGlobalState class
    private static final Logger logger = LoggerFactory.getLogger(HomeState.class);

    public void displayHomeWindow(Controller c, Window w){
        logger.trace("start displayHomeWindow(Controller c)");

        logger.trace("end displayHomeWindow(Controller c)");
    }

    public void displayParameterColorWindow(Controller c)  {
        logger.trace("start displayParameterColorWindow(Controller c)");
        // Style for globalButton
        c.removeStyleClassButton(c.getGlobalSettingsButton(), "button-principal-active");
        c.addStyleClassButton(c.getGlobalSettingsButton(), "button-principal");
        // Style for colorButton
        c.removeStyleClassButton(c.getColorSettingsButton(), "button-principal");
        c.addStyleClassButton(c.getColorSettingsButton(), "button-principal-active");
        // next state
        Controller.setCurrentState(c.settingColorState);
        logger.trace("end displayParameterColorWindow(Controller c)");
    }

    public void displayParameterLanguageWindow(Controller c)  {
        logger.trace("start displayParameterLanguageWindow(Controller c)");
        // Style for globalButton
        c.removeStyleClassButton(c.getGlobalSettingsButton(), "button-principal-active");
        c.addStyleClassButton(c.getGlobalSettingsButton(), "button-principal");
        // Style for colorButton
        c.removeStyleClassButton(c.getLanguageSettingsButton(), "button-principal");
        c.addStyleClassButton(c.getLanguageSettingsButton(), "button-principal-active");
        // next state
        Controller.setCurrentState(c.settingLanguageState);
        logger.trace("end displayParameterLanguageWindow(Controller c)");
    }
}
