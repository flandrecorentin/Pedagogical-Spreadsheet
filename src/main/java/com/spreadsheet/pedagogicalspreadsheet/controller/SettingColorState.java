package com.spreadsheet.pedagogicalspreadsheet.controller;

import com.spreadsheet.pedagogicalspreadsheet.view.Window;
import javafx.scene.Scene;
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
        //Change pannel settings
        c.getSettingsPannel().getChildren().add(c.getLanguageSettingsPannel());
        c.getSettingsPannel().getChildren().remove(c.getColorsSettingsPannel());
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
        //Change pannel settings
        c.getSettingsPannel().getChildren().add(c.getGlobalSettingsPannel());
        c.getSettingsPannel().getChildren().add(c.getLanguageSettingsPannel());
        c.getLanguageSettingsPannel().setMinWidth(0);
        c.getLanguageSettingsPannel().setMaxWidth(0);
        c.getLanguageSettingsPannel().setVisible(false);
        c.getColorsSettingsPannel().setMinWidth(0);
        c.getColorsSettingsPannel().setMaxWidth(0);
        c.getColorsSettingsPannel().setVisible(false);
        // next state
        Controller.setCurrentState(c.settingGlobalState);
        logger.trace("end displayParameterGlobalWindow(Controller c)");
    }

    @Override
    public void changeColorTheme(Controller c, String newStyle){
        if (!newStyle.equals(Window.WindowThemeColor)){
            try{
                Window.WindowThemeColor = newStyle;
                // get stylesheet of the root node and remove it
                Scene scene = Window.windowStage.getScene();
                String css = scene.getRoot().getStylesheets().get(0);
                scene.getRoot().getStylesheets().remove(0);
                // modify the stylesheet use
                int indexStyle = css.indexOf("style");
                css= css.substring(0,indexStyle);
                css += Window.WindowThemeColor;
                // set the new stylesheet
                scene.getRoot().getStylesheets().add(css.toString());
            }
            catch(Exception ex){
                logger.error("[ERROR] during change the stylesheet");
            }
        }
        else{
            logger.warn("[WARN] The newStyle is the same than the old one");
        }
    }
}
