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

    public void displayParameterWindow(Controller c, Window w) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(PedagogicalSpreadsheet.class.getResource("settingsView.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 640, 480);
        w.getWindowStage().setTitle("Parameters [Pedagogical-Spreadsheet]");
//        stage.setTitle("Hello!");
//        stage.setMinWidth(640);
//        stage.setMinHeight(480);
//        stage.setScene(scene);
//        stage.show();
    }
}
