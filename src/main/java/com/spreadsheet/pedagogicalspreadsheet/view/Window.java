package com.spreadsheet.pedagogicalspreadsheet.view;

import com.spreadsheet.pedagogicalspreadsheet.PedagogicalSpreadsheet;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;



import java.io.IOException;

public class Window extends Application {

    // Logger for the Window class
    private static final Logger logger = LoggerFactory.getLogger(Window.class);
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(PedagogicalSpreadsheet.class.getResource("homeView.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 640, 480);
        stage.setTitle("Hello!");
        stage.setMinWidth(640);
        stage.setMinHeight(480);
        stage.setScene(scene);
        stage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
}
