package com.spreadsheet.pedagogicalspreadsheet.controller;

import com.spreadsheet.pedagogicalspreadsheet.view.Window;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.IOException;

public class Controller {

    // Logger for the Controller class
    private static final Logger logger = LoggerFactory.getLogger(Controller.class);

    public Controller() {
        /* this.listeCommandes = new ListOfCommands(); */
    }








// ******************* STATE ****************


    // List of all States possibles
    protected static final State homeState = new HomeState();

    protected static final State settingGlobalState = new SettingGlobalState();

    protected static final State settingColorState = new SettingColorState();

    protected static final State settingLanguageState = new SettingLanguageState();

    protected static final State fillPrincipalState = new FillPrincipalState();









    // Declaration of the current state : home at the start of the application
    private static State currentState = homeState;

    public static State getCurrentState() {
        return currentState;
    }

    protected static void setCurrentState(State currentState) {
        Controller.currentState = currentState;
    }

    // ******************* STATE ****************













    // ******************* FXML ****************
    @FXML
    private  Button discoverGamesButton;

    @FXML
    private Button newSpreadsheetButton;

    @FXML
    private Button openSpreadsheetButton;

    @FXML
    private Button settingsButton;
    @FXML
    private VBox languageSettingsPannel;


    public VBox getLanguageSettingsPannel() {
        return languageSettingsPannel;
    }
    public VBox getGlobalSettingsPannel() {
        return globalSettingsPannel;
    }
    @FXML
    private VBox globalSettingsPannel;

    public VBox getColorsSettingsPannel() {
        return colorsSettingsPannel;
    }

    @FXML
    private VBox colorsSettingsPannel;

    public HBox getSettingsPannel() {
        return SettingsPannel;
    }

    @FXML
    private HBox SettingsPannel;

    public Button getColorSettingsButton() {
        return colorSettingsButton;
    }

    @FXML
    private Button colorSettingsButton;

    public Button getGlobalSettingsButton() {
        return globalSettingsButton;
    }

    @FXML
    private Button globalSettingsButton;

    public Button getLanguageSettingsButton() {
        return languageSettingsButton;
    }

    @FXML
    private Button languageSettingsButton;

    @FXML
    private Button englishLanguageButton;

    @FXML
    private Button frenchLanguageButton;

    @FXML
    void discoverGames(ActionEvent event) {
        logger.trace("Button listener discover games");
    }

    @FXML
    void goToSettings(ActionEvent event) throws IOException, InterruptedException {
        logger.trace("Button listener go to settings");
        this.displayParameterGlobalWindow();
    }

    @FXML
    void newSpreadsheet(ActionEvent event) {
        logger.trace("Button listener new spreadsheet |"+this.newSpreadsheetButton.getText()+"|");
        this.createNewSpreadsheetFromZero();
    }

    @FXML
    void openSpreadsheet(ActionEvent event) {
        logger.trace("Button listener open existing spreadsheet");
    }

    @FXML
    void colorSettings(ActionEvent event) {
        this.displayParameterColorWindow();
        logger.trace("Button listener color settings");
    }

    @FXML
    void globalSettings(ActionEvent event) {
        this.displayParameterGlobalWindow();
        logger.trace("Button listener global settings");
    }

    @FXML
    void languageSettings(ActionEvent event) {
        this.displayParameterLanguageWindow();
        logger.trace("Button listener languages settings");
    }
    @FXML
    void putEnglishLanguage(ActionEvent event) {
        logger.trace("Button listener english language");
    }

    @FXML
    void putFrenchLanguage(ActionEvent event) {
        logger.trace("Button listener french language");
    }

    @FXML
    private Button blackTheme;

    @FXML
    private Button blueTheme;
    @FXML
    private Button greenTheme;
    @FXML
    private Button orangeTheme;

    @FXML
    private Button purpleTheme;

    @FXML
    private Button redTheme;
    @FXML
    void putBlackTheme(ActionEvent event) {
        logger.trace("Button listener black theme");
    }

    @FXML
    void putBlueTheme(ActionEvent event) {
        logger.trace("Button listener blue theme");
    }
    @FXML
    void putGreenTheme(ActionEvent event) {
        logger.trace("Button listener green theme");
    }

    @FXML
    void putOrangeTheme(ActionEvent event) {
        logger.trace("Button listener orange theme");
    }

    @FXML
    void putPurpleTheme(ActionEvent event) {
        logger.trace("Button listener purple theme");
    }

    @FXML
    void putRedTheme(ActionEvent event) {
        logger.trace("Button listener red theme");
    }

    // ******** SPREADSHEE ******

    @FXML
    private Button cellNavBarButton;

    @FXML
    private VBox contenerSpreadsheet;

    @FXML
    private Button diagramNavBarButton;

    @FXML
    private Button fileNavBarButton;

    @FXML
    private Button gameNavBarButton;

    @FXML
    private Button helpNavBarButton;

    @FXML
    private Button homeNavBarButton;

    @FXML
    void goToCellFromNavBar(ActionEvent event) {
        logger.trace("Button listener goToCellFromNavBar");
    }

    @FXML
    void goToDiagramFromNavBar(ActionEvent event) {
        logger.trace("Button listener goToDiagramFromNavBar");
    }

    @FXML
    void goToFileFromNavBar(ActionEvent event) {
        logger.trace("Button listener goToFileFromNavBar");
    }

    @FXML
    void goToGameFromNavBar(ActionEvent event) {
        logger.trace("Button listener goToGameFromNavBar");
    }

    @FXML
    void goToHelpFromNavBar(ActionEvent event) {
        logger.trace("Button listener goToHelpFromNavBar");
    }

    @FXML
    void goToHomeFromNavBar(ActionEvent event) {
        logger.trace("Button listener goToHomeFromNavBar");
    }


    // ******************* FXML ****************



















// ************ STYLE CONTROLLER ***********************
public void addStyleClassButton(Button b, String s){
    b.getStyleClass().add(s);
}
public void removeStyleClassButton(Button b, String s){
    b.getStyleClass().remove(s);
}

// ************ STYLE CONTROLLER ***********************


















    // ************ CONTROLLER SETTING PARAMETER ***********************
    public String JUnitTest(){
        return "Hello";
    }

    public void displayParameterGlobalWindow(){
        try {
            currentState.displayParameterGlobalWindow(this);
        }
        catch (Exception ex){
            logger.error("**!** problem displayParameterGlobalWindow **!** ");
            ex.printStackTrace();
        }
    }

    public void displayParameterColorWindow(){
        try {
            currentState.displayParameterColorWindow(this);
        }
        catch (Exception ex){
            logger.error("**!** problem displayParameterColorWindow **!** ");
            ex.printStackTrace();
        }
    }


    public void displayParameterLanguageWindow(){
        try {
            currentState.displayParameterLanguageWindow(this);
        }
        catch (Exception ex){
            logger.error("**!** problem displayParameterColorWindow **!** ");
            ex.printStackTrace();
        }
    }


    // Create new SpreadsheetFromZero (Home)
    public void createNewSpreadsheetFromZero(){
        try {
            currentState.createNewSpreadsheetFromZero(this);
        }
        catch (Exception ex){
            logger.error("**!** problem createNewSpreadsheetFromZero **!** ");
            ex.printStackTrace();
        }
    }
    // ************ CONTROLLER SETTING PARAMETER ***********************
}
