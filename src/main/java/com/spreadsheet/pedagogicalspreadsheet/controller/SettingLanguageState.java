package com.spreadsheet.pedagogicalspreadsheet.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class SettingLanguageState implements State{
    // Logger for the SettingLanguageState class
    private static final Logger logger = LoggerFactory.getLogger(SettingLanguageState.class);

    public void displayParameterColorWindow(Controller c)  {
        logger.trace("start displayParameterColorWindow(Controller c)");
        // Style for globalButton
        c.removeStyleClassButton(c.getLanguageSettingsButton(), "button-principal-active");
        c.addStyleClassButton(c.getLanguageSettingsButton(), "button-principal");
        // Style for colorButton
        c.removeStyleClassButton(c.getColorSettingsButton(), "button-principal");
        c.addStyleClassButton(c.getColorSettingsButton(), "button-principal-active");
        // next state
        Controller.setCurrentState(c.settingColorState);
        logger.trace("end displayParameterColorWindow(Controller c)");
    }

    public void displayParameterGlobalWindow(Controller c)  {
        logger.trace("start displayParameterGlobalWindow(Controller c)");
        // Style for globalButton
        c.removeStyleClassButton(c.getLanguageSettingsButton(), "button-principal-active");
        c.addStyleClassButton(c.getLanguageSettingsButton(), "button-principal");
        // Style for colorButton
        c.removeStyleClassButton(c.getGlobalSettingsButton(), "button-principal");
        c.addStyleClassButton(c.getGlobalSettingsButton(), "button-principal-active");
        // next state
        Controller.setCurrentState(c.settingGlobalState);
        logger.trace("end displayParameterGlobalWindow(Controller c)");
    }
}
