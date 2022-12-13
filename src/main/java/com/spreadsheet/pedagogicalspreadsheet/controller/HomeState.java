package com.spreadsheet.pedagogicalspreadsheet.controller;

import com.spreadsheet.pedagogicalspreadsheet.PedagogicalSpreadsheet;
import com.spreadsheet.pedagogicalspreadsheet.view.Window;
import javafx.collections.ObservableList;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.ScrollPane;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.IOException;

public class HomeState implements  State{
    // Logger for the HomeState class
    private static final Logger logger = LoggerFactory.getLogger(HomeState.class);

    @Override
    public void displayParameterGlobalWindow(Controller c) throws IOException {
        try{
            logger.trace("start displayParameterGlobalWindow(Controller c)");
            FXMLLoader fxmlLoader = new FXMLLoader(PedagogicalSpreadsheet.class.getResource("settingsView.fxml"));
            double width = Window.windowStage.getWidth();
            double height = Window.windowStage.getHeight();
            Scene scene = new Scene(fxmlLoader.load(), width, height);
            Window.windowStage.setTitle("Parameters [Pedagogical-Spreadsheet]");
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
            Controller.setCurrentState(c.settingGlobalState);
            logger.trace("end displayParameterGlobalWindow(Controller c)");
        }
        catch (Exception ex){
            logger.error("[ERROR] during displayParameterGlobalWindow");
            ex.printStackTrace();
        }
    }

    @Override
    public void createNewSpreadsheetFromZero(Controller c) throws IOException{
        try{
            logger.trace("start createNewSpreadsheetFromZero(Controller c)");
            FXMLLoader fxmlLoader = new FXMLLoader(PedagogicalSpreadsheet.class.getResource("spreadsheetView.fxml"));
            double width = Window.windowStage.getWidth();
            double height = Window.windowStage.getHeight();
            Scene scene = new Scene(fxmlLoader.load(), width, height);
            Window.windowStage.setTitle("feuille1 [Pedagogical-Spreadsheet]");
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
            Controller.setCurrentState(c.fillPrincipalState);
            logger.trace("end createNewSpreadsheetFromZero(Controller c)");
        }
        catch(Exception ex){
            logger.error("[ERROR] during createNewSpreadsheetFromZero");
            ex.printStackTrace();
        }
    }
}
