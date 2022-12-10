package com.spreadsheet.pedagogicalspreadsheet.view;

import com.spreadsheet.pedagogicalspreadsheet.PedagogicalSpreadsheet;
import com.spreadsheet.pedagogicalspreadsheet.controller.Controller;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;



import java.io.IOException;

public class Window extends Application {

    // TODO Instaurer un fichier de configuration Log4j2 -> cela afficher uniquement les erreurs dans la console
    // Logger for the Window class
    private static final Logger logger = LoggerFactory.getLogger(Window.class);
    public static Stage windowStage;
    private final Controller controller;

    public Window() {
        logger.trace("Builder Window()");
        this.controller = new Controller();
    }

    @Override
    public void start(Stage stage) throws IOException {
        logger.trace("start @Override start of application");
        this.windowStage = stage;
        FXMLLoader fxmlLoader = new FXMLLoader(PedagogicalSpreadsheet.class.getResource("homeView.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 640, 480);
        this.windowStage.setTitle("Home [Pedagogical-Spreadsheet]");
        this.windowStage.setMinWidth(640);
        this.windowStage.setMinHeight(480);
        this.windowStage.setScene(scene);
        try{
            this.windowStage.getIcons().add(new Image(getClass().getResource("/images/icon128-temporaire.png").toExternalForm()));
        }
        catch (Exception ex){
            logger.error("[ERROR] Problem during set Icon for the windowStage");
        }
        this.windowStage.show();
        logger.trace("end @Override start of application");
    }

    public static void main(String[] args) {
        launch(args);
    }


}
