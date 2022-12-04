package com.spreadsheet.pedagogicalspreadsheet.controller;

import com.spreadsheet.pedagogicalspreadsheet.view.Window;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Controller {

    // Logger for the Controller class
    private static final Logger logger = LoggerFactory.getLogger(Controller.class);


    // ******************* STATE ****************


    // List of all States possibles
    protected static final State homeState = new HomeState();

    protected static final State settingGlobalState = new SettingGlobalState();





    // Declaration of the current state : home at the start of the application
    private static State currentState = homeState;

    // Window
    private static Window window;

    public Controller() {
        /* this.listeCommandes = new ListOfCommands(); */
    }

    // ******************* STATE ****************




    // ******************* FXML ****************
    @FXML
    private Button discoverGamesButton;

    @FXML
    private Button newSpreadsheetButton;

    @FXML
    private Button openSpreadsheetButton;

    @FXML
    private Button settingsButton;

    @FXML
    private Button colorSettingsButton;

    @FXML
    private Button globalSettingsButton;

    @FXML
    private Button languageSettingsButton;

    @FXML
    void discoverGames(ActionEvent event) {
        System.out.println("aller dans la page découvrir jeu");

    }

    @FXML
    void goToSettings(ActionEvent event) {
        displayParameterWindow();
        System.out.println("aller dans la page paramètres");
    }

    @FXML
    void newSpreadsheet(ActionEvent event) {
        System.out.println("créer une nouvelle feuille de calcul");
    }

    @FXML
    void openSpreadsheet(ActionEvent event) {
        System.out.println("ouvrir une feuille de calcul");
    }

    @FXML
    void colorSettings(ActionEvent event) {

    }

    @FXML
    void globalSettings(ActionEvent event) {

    }

    @FXML
    void languageSettings(ActionEvent event) {

    }
    // ******************* FXML ****************











    // ************ CONTROLLER ***********************
    public String JUnitTest(){
        return "Hello";
    }

    public void displayParameterWindow(){
        try {
            currentState.displayParameterWindow(this, window);
        }
        catch (Exception ex){
            logger.error("problem displayParameterWindow");
        }
    }

    // ************ CONTROLLER ***********************
}
