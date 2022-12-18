package com.spreadsheet.pedagogicalspreadsheet.controller;

import com.spreadsheet.pedagogicalspreadsheet.PedagogicalSpreadsheet;
import com.spreadsheet.pedagogicalspreadsheet.view.Window;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Objects;

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
                //Remove active button Color theme
                if(c.getBlueTheme().getStyleClass().contains("button-color-active")) {
                    c.removeStyleClassButton(c.getBlueTheme(), "button-color-active");
                    c.addStyleClassButton(c.getBlueTheme(), "button-color");
                    c.addStyleClassButton(c.getBlueTheme(), "button-color-hover");
                }
                if(c.getPurpleTheme().getStyleClass().contains("button-color-active")) {
                    c.removeStyleClassButton(c.getPurpleTheme(), "button-color-active");
                    c.addStyleClassButton(c.getPurpleTheme(), "button-color");
                    c.addStyleClassButton(c.getPurpleTheme(), "button-color-hover");
                }
                if(c.getBlackAndWhiteTheme().getStyleClass().contains("button-color-active")) {
                    c.removeStyleClassButton(c.getBlackAndWhiteTheme(), "button-color-active");
                    c.addStyleClassButton(c.getBlackAndWhiteTheme(), "button-color");
                    c.addStyleClassButton(c.getBlackAndWhiteTheme(), "button-color-hover");
                }
                if(c.getOrangeTheme().getStyleClass().contains("button-color-active")) {
                    c.removeStyleClassButton(c.getOrangeTheme(), "button-color-active");
                    c.addStyleClassButton(c.getOrangeTheme(), "button-color");
                    c.addStyleClassButton(c.getOrangeTheme(), "button-color-hover");
                }
                if(c.getGreenTheme().getStyleClass().contains("button-color-active")) {
                    c.removeStyleClassButton(c.getGreenTheme(), "button-color-active");
                    c.addStyleClassButton(c.getGreenTheme(), "button-color");
                    c.addStyleClassButton(c.getGreenTheme(), "button-color-hover");
                }
                // modify the stylesheet use
                int indexStyle = css.indexOf("style");
                css= css.substring(0,indexStyle);
                css += Window.WindowThemeColor;
                //add the new active button color theme
                switch (Window.WindowThemeColor){
                    case "style.css":
                        c.removeStyleClassButton(c.getGreenTheme(), "button-color");
                        c.addStyleClassButton(c.getGreenTheme(), "button-color-active");
                        c.removeStyleClassButton(c.getGreenTheme(), "button-color-hover");
                        break;
                    case "style-theme-black-and-white.css":
                        c.removeStyleClassButton(c.getBlackAndWhiteTheme(), "button-color");
                        c.addStyleClassButton(c.getBlackAndWhiteTheme(), "button-color-active");
                        c.removeStyleClassButton(c.getBlackAndWhiteTheme(), "button-color-hover");
                        break;
                    case "style-theme-blue.css":
                        c.removeStyleClassButton(c.getBlueTheme(), "button-color");
                        c.addStyleClassButton(c.getBlueTheme(), "button-color-active");
                        c.removeStyleClassButton(c.getBlueTheme(), "button-color-hover");
                        break;
                    case "style-theme-orange.css":
                        c.removeStyleClassButton(c.getOrangeTheme(), "button-color");
                        c.addStyleClassButton(c.getOrangeTheme(), "button-color-active");
                        c.removeStyleClassButton(c.getOrangeTheme(), "button-color-hover");
                        break;
                    case "style-theme-purple.css":
                        c.removeStyleClassButton(c.getPurpleTheme(), "button-color");
                        c.addStyleClassButton(c.getPurpleTheme(), "button-color-active");
                        c.removeStyleClassButton(c.getPurpleTheme(), "button-color-hover");
                        break;
                }

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
