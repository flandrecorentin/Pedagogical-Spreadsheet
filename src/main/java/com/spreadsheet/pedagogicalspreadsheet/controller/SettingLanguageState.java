package com.spreadsheet.pedagogicalspreadsheet.controller;

import com.spreadsheet.pedagogicalspreadsheet.PedagogicalSpreadsheet;
import com.spreadsheet.pedagogicalspreadsheet.view.Window;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.Region;
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
        // Style for colorButtonSettings
        c.removeStyleClassButton(c.getColorSettingsButton(), "button-principal");
        c.addStyleClassButton(c.getColorSettingsButton(), "button-principal-active");
        //Change pannel settings
        c.getSettingsPannel().getChildren().remove(c.getLanguageSettingsPannel());
        c.getSettingsPannel().getChildren().add(c.getColorsSettingsPannel());
        //modify style for ColorThemeButton
        if(!Window.WindowThemeColor.equals("style.css")) {
            c.removeStyleClassButton(c.getGreenTheme(), "button-color-active");
            c.addStyleClassButton(c.getGreenTheme(), "button-color");
            c.addStyleClassButton(c.getGreenTheme(),"button-color-hover");
            switch (Window.WindowThemeColor){
                case "style-theme-black-and-white.css":
                    c.removeStyleClassButton(c.getBlackAndWhiteTheme(), "button-color");
                    c.addStyleClassButton(c.getBlackAndWhiteTheme(), "button-color-active");
                    c.removeStyleClassButton(c.getBlackAndWhiteTheme(),"button-color-hover");
                    break;
                case "style-theme-blue.css":
                    c.removeStyleClassButton(c.getBlueTheme(), "button-color");
                    c.addStyleClassButton(c.getBlueTheme(), "button-color-active");
                    c.removeStyleClassButton(c.getBlueTheme(),"button-color-hover");
                    break;
                case "style-theme-orange.css":
                    c.removeStyleClassButton(c.getOrangeTheme(), "button-color");
                    c.addStyleClassButton(c.getOrangeTheme(), "button-color-active");
                    c.removeStyleClassButton(c.getOrangeTheme(),"button-color-hover");
                    break;
                case "style-theme-purple.css":
                    c.removeStyleClassButton(c.getPurpleTheme(), "button-color");
                    c.addStyleClassButton(c.getPurpleTheme(), "button-color-active");
                    c.removeStyleClassButton(c.getPurpleTheme(),"button-color-hover");
                    break;
            }
        }
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
        //Change pannel settings
        c.getSettingsPannel().getChildren().add(c.getGlobalSettingsPannel());
        c.getLanguageSettingsPannel().setMinWidth(0);
        c.getLanguageSettingsPannel().setMaxWidth(0);
        c.getLanguageSettingsPannel().setVisible(false);
        c.getSettingsPannel().getChildren().add(c.getColorsSettingsPannel());
        c.getColorsSettingsPannel().setMinWidth(0);
        c.getColorsSettingsPannel().setMaxWidth(0);
        c.getColorsSettingsPannel().setVisible(false);
        // next state
        Controller.setCurrentState(c.settingGlobalState);
        logger.trace("end displayParameterGlobalWindow(Controller c)");
    }
    public void displayHomeState(Controller c){
        try{
            logger.trace("start displayHomeState(Controller c)");
            FXMLLoader fxmlLoader = new FXMLLoader(PedagogicalSpreadsheet.class.getResource("homeView.fxml"));
            double width = Window.windowStage.getScene().getWidth();
            double height = Window.windowStage.getScene().getHeight();
            Scene scene = new Scene(fxmlLoader.load(), width, height);
            Window.windowStage.setTitle("Home [Pedagogical-Spreadsheet]");
            Window.windowStage.setScene(scene);
            // stylesheet
            if(!Window.WindowThemeColor.equals("style.css")){
                try{
                    // get stylesheet of the root node and remove it
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
            Controller.setCurrentState(c.homeState);
            logger.trace("end displayHomeState(Controller c)");
        }
        catch (Exception ex){
            logger.error("[ERROR] during displayHomeStateWindow");
            ex.printStackTrace();
        }
    }
}
