package com.spreadsheet.pedagogicalspreadsheet.controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ScrollPane;
import javafx.scene.control.SplitPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import de.jensd.fx.glyphs.fontawesome.FontAwesomeIcon;
import de.jensd.fx.glyphs.GlyphsDude;


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

    protected static final State filePrincipalState = new FilePrincipalState();
    protected static final State cellPrincipalState = new CellPrincipalState();
    protected static final State diagramPrincipalState = new DiagramPrincipalState();
    protected static final State gamePrincipalState = new GamePrincipalState();
    protected static final State helpPrincipalState = new HelpPrincipalState();









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

    public ScrollPane getScrollPane() {
        return scrollPane;
    }

    @FXML
    private ScrollPane scrollPane;

    @FXML
    private SplitPane spiltPane;

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


    public Button getBlueTheme() {
        return blueTheme;
    }

    public Button getBlackAndWhiteTheme() {
        return blackAndWhiteTheme;
    }

    public Button getPurpleTheme() {
        return purpleTheme;
    }

    public Button getOrangeTheme() {
        return orangeTheme;
    }

    @FXML
    private Button blueTheme;

    public Button getGreenTheme() {
        return greenTheme;
    }

    @FXML
    private Button greenTheme;
    @FXML
    private Button blackAndWhiteTheme;

    @FXML
    private Button purpleTheme;

    @FXML
    private Button orangeTheme;

    @FXML
    void putBlueTheme(ActionEvent event) {
        logger.trace("Button listener blue theme");
        this.changeColorTheme("style-theme-blue.css");
    }
    @FXML
    void putGreenTheme(ActionEvent event) {
        logger.trace("Button listener green theme");
        this.changeColorTheme("style.css");
    }

    @FXML
    void putBlackAndWitheTheme(ActionEvent event) {
        logger.trace("Button listener black and white theme");
        this.changeColorTheme("style-theme-black-and-white.css");
    }

    @FXML
    void putPurpleTheme(ActionEvent event) {
        logger.trace("Button listener purple theme");
        this.changeColorTheme("style-theme-purple.css");
    }

    @FXML
    void putOrangeTheme(ActionEvent event) {
        logger.trace("Button listener orange theme");
        this.changeColorTheme("style-theme-orange.css");
    }

    // ******** SPREADSHEET ******

    public Button getCellNavBarButton() {
        return cellNavBarButton;
    }

    @FXML
    private Button cellNavBarButton;

    @FXML
    private VBox contenerSpreadsheet;

    public Button getDiagramNavBarButton() {
        return diagramNavBarButton;
    }

    @FXML
    private Button diagramNavBarButton;

    public Button getFileNavBarButton() {
        return fileNavBarButton;
    }

    @FXML
    private Button fileNavBarButton;

    public Button getGameNavBarButton() {
        return gameNavBarButton;
    }

    @FXML
    private Button gameNavBarButton;

    public Button getHelpNavBarButton() {
        return helpNavBarButton;
    }

    @FXML
    private Button helpNavBarButton;

    public Button getHomeNavBarButton() {
        return homeNavBarButton;
    }

    @FXML
    private Button homeNavBarButton;
    @FXML
    private Button homeSettingButton;
    @FXML
    void goToHomeFromSetting(ActionEvent event) {
        logger.trace("Button listener goToHomeFromSetting");
        this.displayHomeState();
    }

    @FXML
    void goToCellFromNavBar(ActionEvent event) {
        logger.trace("Button listener goToCellFromNavBar");
        this.displayCellPrincipalState();
    }

    @FXML
    void goToDiagramFromNavBar(ActionEvent event) {
        logger.trace("Button listener goToDiagramFromNavBar");
        this.displayDiagramPrincipalState();
    }

    @FXML
    void goToFileFromNavBar(ActionEvent event) {
        logger.trace("Button listener goToFileFromNavBar");
        this.displayFilePrincipalState();
    }

    @FXML
    void goToGameFromNavBar(ActionEvent event) {
        logger.trace("Button listener goToGameFromNavBar");
        this.displayGamePrincipalState();
    }

    @FXML
    void goToHelpFromNavBar(ActionEvent event) {
        logger.trace("Button listener goToHelpFromNavBar");
        this.displayHelpPrincipalState();
    }

    @FXML
    void goToHomeFromNavBar(ActionEvent event) {
        logger.trace("Button listener goToHomeFromNavBar");
        this.displayHomeState();
    }


    // ******************* FXML ****************



















// ************ STYLE CONTROLLER ***********************
public void addStyleClassButton(Button b, String s){
    b.getStyleClass().add(s);
}
public void removeStyleClassButton(Button b, String s){
    b.getStyleClass().remove(s);
}

public void changeActivedNavBarButton(Button b){
        if(b.getStyleClass().contains("navigation-button-active")){
            this.removeStyleClassButton(b, "navigation-button-active");
            this.addStyleClassButton(b, "navigation-button");
        }
        else if(b.getStyleClass().contains("navigation-button")){
            this.removeStyleClassButton(b, "navigation-button");
            this.addStyleClassButton(b, "navigation-button-active");
        }
}

// ************ STYLE CONTROLLER ***********************


















    // ************ CONTROLLER SETTING AND HOME ***********************
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

    public void changeColorTheme(String newStyle){
        try {
            currentState.changeColorTheme(this, newStyle);
        }
        catch (Exception ex){
            logger.error("[ERROR] changeColorTheme with the style ("+newStyle+")");
            ex.printStackTrace();
        }
    }

    // ************ CONTROLLER SETTING AND HOME ***********************





    // ************ CONTROLLER SPREADSHEET ***********************
    public void displayHomeState(){
        try {
            currentState.displayHomeState(this);
        }
        catch (Exception ex){
            logger.error("[ERROR] displayHomeState ");
            ex.printStackTrace();
        }
    }

    public void displayFilePrincipalState(){
        try {
            currentState.displayFilePrincipalState(this);
        }
        catch (Exception ex){
            logger.error("[ERROR] displayFilePrincipalState ");
            ex.printStackTrace();
        }
    }

    public void displayCellPrincipalState(){
        try {
            currentState.displayCellPrincipalState(this);
        }
        catch (Exception ex){
            logger.error("[ERROR] displayCellPrincipalState ");
            ex.printStackTrace();
        }
    }

    public void displayDiagramPrincipalState(){
        try {
            currentState.displayDiagramPrincipalState(this);
        }
        catch (Exception ex){
            logger.error("[ERROR] displayDiagramPrincipalState ");
            ex.printStackTrace();
        }
    }

    public void displayGamePrincipalState(){
        try {
            currentState.displayGamePrincipalState(this);
        }
        catch (Exception ex){
            logger.error("[ERROR] displayGamePrincipalState ");
            ex.printStackTrace();
        }
    }

    public void displayHelpPrincipalState(){
        try {
            currentState.displayHelpPrincipalState(this);
        }
        catch (Exception ex){
            logger.error("[ERROR] displayHelpPrincipalState ");
            ex.printStackTrace();
        }
    }

    // ************ CONTROLLER SPREADSHEET ***********************
}
