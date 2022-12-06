package com.spreadsheet.pedagogicalspreadsheet.controller;

import com.spreadsheet.pedagogicalspreadsheet.PedagogicalSpreadsheet;
import com.spreadsheet.pedagogicalspreadsheet.view.Window;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.IOException;

public class HomeState implements  State{
    // Logger for the HomeState class
    private static final Logger logger = LoggerFactory.getLogger(HomeState.class);

    public void displayParameterWindow(Controller c) throws IOException {
        logger.trace("start displayParameterWindow(Controller c, Window w)");
        FXMLLoader fxmlLoader = new FXMLLoader(PedagogicalSpreadsheet.class.getResource("settingsView.fxml"));
        double width = Window.windowStage.getWidth();
        double height = Window.windowStage.getHeight();
        Scene scene = new Scene(fxmlLoader.load(), width, height);
        Window.windowStage.setTitle("Parameters [Pedagogical-Spreadsheet]");
        Window.windowStage.setScene(scene);
        c.setCurrentState(c.settingGlobalState);
        logger.trace("end displayParameterWindow(Controller c, Window w)");
    }
}
