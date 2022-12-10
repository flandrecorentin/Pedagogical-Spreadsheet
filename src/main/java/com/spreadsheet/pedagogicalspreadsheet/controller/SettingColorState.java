package com.spreadsheet.pedagogicalspreadsheet.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class SettingColorState implements State{
    // Logger for the SettingLanguageState class
    private static final Logger logger = LoggerFactory.getLogger(SettingColorState.class);

    public void displayParameterLanguageWindow(Controller c)  {
        logger.trace("start displayParameterLanguageWindow(Controller c)");
        // Style for globalButton
        c.removeStyleClassButton(c.getColorSettingsButton(), "button-principal-active");
        c.addStyleClassButton(c.getColorSettingsButton(), "button-principal");
        // Style for colorButton
        c.removeStyleClassButton(c.getLanguageSettingsButton(), "button-principal");
        c.addStyleClassButton(c.getLanguageSettingsButton(), "button-principal-active");
        // next state
        Controller.setCurrentState(c.settingLanguageState);
        logger.trace("end displayParameterLanguageWindow(Controller c)");
    }

    public void displayParameterGlobalWindow(Controller c)  {
        logger.trace("start displayParameterGlobalWindow(Controller c)");
        // Style for globalButton
        c.removeStyleClassButton(c.getColorSettingsButton(), "button-principal-active");
        c.addStyleClassButton(c.getColorSettingsButton(), "button-principal");
        // Style for colorButton
        c.removeStyleClassButton(c.getGlobalSettingsButton(), "button-principal");
        c.addStyleClassButton(c.getGlobalSettingsButton(), "button-principal-active");
        // next state
        Controller.setCurrentState(c.settingGlobalState);
        logger.trace("end displayParameterGlobalWindow(Controller c)");
    }
}