package com.spreadsheet.pedagogicalspreadsheet;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.event.ActionEvent;
import javafx.scene.control.Button;

public class TestController {


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




    public String JUnitTest(){
        return "Hello";
    }
}