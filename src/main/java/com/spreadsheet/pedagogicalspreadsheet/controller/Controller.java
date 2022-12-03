package com.spreadsheet.pedagogicalspreadsheet.controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Controller {

    // Logger for the Controller class
    private static final Logger logger = LoggerFactory.getLogger(Controller.class);






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
    void discoverGames(ActionEvent event) {
        System.out.println("aller dans la page découvrir jeu");

    }

    @FXML
    void goToSettings(ActionEvent event) {
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


    // ******************* FXML ****************











    // ************ CONTROLLER ***********************
    public String JUnitTest(){
        return "Hello";
    }

    // ************ CONTROLLER ***********************
}
