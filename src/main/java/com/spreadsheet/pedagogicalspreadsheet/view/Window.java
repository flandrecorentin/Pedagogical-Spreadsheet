package com.spreadsheet.pedagogicalspreadsheet.view;

import com.spreadsheet.pedagogicalspreadsheet.PedagogicalSpreadsheet;
import com.spreadsheet.pedagogicalspreadsheet.controller.Controller;
import com.spreadsheet.pedagogicalspreadsheet.model.objects.Spreadsheet;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;



import java.io.IOException;
import java.util.LinkedList;

public class Window extends Application {

    // Logger for the Window class
    private static final Logger logger = LoggerFactory.getLogger(Window.class);
    public static Stage windowStage;

    public static LinkedList<Spreadsheet> spreadsheets;

    public static String WindowThemeColor = "style.css";

    public Window() {
        logger.trace("Builder Window()");
    }

    @Override
    public void start(Stage stage) throws IOException {
        logger.trace("start @Override start of application");
        spreadsheets = new LinkedList<Spreadsheet>();
        this.windowStage = stage;
        FXMLLoader fxmlLoader = new FXMLLoader(PedagogicalSpreadsheet.class.getResource("homeView.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 640, 480);
        this.windowStage.setTitle("Home [Pedagogical-Spreadsheet]");
        this.windowStage.setMinWidth(640);
        this.windowStage.setMinHeight(480);
        this.windowStage.setScene(scene);
        // *** stylesheet
        if(!this.WindowThemeColor.equals("style.css")){
            try{
                // get stylesheet of the root node and remove it
                String css = scene.getRoot().getStylesheets().get(0);
                scene.getRoot().getStylesheets().remove(0);
                // modify the stylesheet use
                int indexStyle = css.indexOf("style");
                css= css.substring(0,indexStyle);
                css += this.WindowThemeColor;
                // set the new stylesheet
                scene.getRoot().getStylesheets().add(css.toString());
            }
            catch(Exception ex){
                logger.error("[ERROR] during change the stylesheet");
            }
        }
        // *** icon
        try{
            this.windowStage.getIcons().add(new Image(getClass().getResource("/images/logo.png").toExternalForm()));
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
