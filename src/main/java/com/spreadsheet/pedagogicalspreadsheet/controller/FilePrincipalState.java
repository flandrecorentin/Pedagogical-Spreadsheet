package com.spreadsheet.pedagogicalspreadsheet.controller;

import com.spreadsheet.pedagogicalspreadsheet.view.Window;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.geometry.Orientation;
import javafx.scene.control.ListView;
import javafx.scene.control.TableView;
import javafx.scene.layout.Region;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.List;

public class FilePrincipalState implements State {
    private static final Logger logger = LoggerFactory.getLogger(FilePrincipalState.class);

    @Override
    public void displayHomeState(Controller c){
        logger.trace("start displayHomeState(Controller c)");
        logger.trace("end start displayHomeState(Controller c)");

    }
    @Override
    public void displayCellPrincipalState(Controller c){
        logger.trace("start displayCellPrincipalState(Controller c)");
        // Style for navbar
        c.changeActivedNavBarButton(c.getFileNavBarButton());
        c.changeActivedNavBarButton(c.getCellNavBarButton());
        // display cellNavToolsBar
        c.getPaneToolBar().getChildren().remove(c.getFilePannel());
        c.getCellPannel().setMinHeight(Region.USE_PREF_SIZE);
        c.getCellPannel().setMaxHeight(Region.USE_PREF_SIZE);
        c.getCellPannel().setVisible(true);
        Controller.setCurrentState(c.cellPrincipalState);
        logger.trace("end start displayCellPrincipalState(Controller c)");
    }


    @Override
    public void displayDiagramPrincipalState(Controller c){
        logger.trace("start displayDiagramPrincipalState(Controller c)");
        // Style for navbar
        c.changeActivedNavBarButton(c.getFileNavBarButton());
        c.changeActivedNavBarButton(c.getDiagramNavBarButton());
        // display diagramNavToolsBar
        c.getPaneToolBar().getChildren().remove(c.getFilePannel());
        c.getCellPannel().setMinHeight(Region.USE_PREF_SIZE);
        c.getCellPannel().setMaxHeight(Region.USE_PREF_SIZE);
        c.getCellPannel().setVisible(true);
        c.getPaneToolBar().getChildren().remove(c.getCellPannel());

        Controller.setCurrentState(c.diagramPrincipalState);
        logger.trace("end start displayCellPrincipalState(Controller c)");
    }

    @Override
    public void displayGamePrincipalState(Controller c){
        logger.trace("start displayGamePrincipalState(Controller c)");
        // Style for navbar
        c.changeActivedNavBarButton(c.getFileNavBarButton());
        c.changeActivedNavBarButton(c.getGameNavBarButton());
        // display gameNavToolsBar
        c.getPaneToolBar().getChildren().remove(c.getFilePannel());
        c.getCellPannel().setMinHeight(Region.USE_PREF_SIZE);
        c.getCellPannel().setMaxHeight(Region.USE_PREF_SIZE);
        c.getCellPannel().setVisible(true);
        c.getPaneToolBar().getChildren().remove(c.getCellPannel());

        Controller.setCurrentState(c.gamePrincipalState);
        logger.trace("end start displayGamePrincipalState(Controller c)");
    }

    @Override
    public void displayHelpPrincipalState(Controller c){
        logger.trace("start displayHelpPrincipalState(Controller c)");
        // Style for navbar
        c.changeActivedNavBarButton(c.getFileNavBarButton());
        c.changeActivedNavBarButton(c.getHelpNavBarButton());
        // display gameNavToolsBar
        c.getPaneToolBar().getChildren().remove(c.getFilePannel());
        c.getCellPannel().setMinHeight(Region.USE_PREF_SIZE);
        c.getCellPannel().setMaxHeight(Region.USE_PREF_SIZE);
        c.getCellPannel().setVisible(true);
        c.getPaneToolBar().getChildren().remove(c.getCellPannel());
        //Change state
        Controller.setCurrentState(c.helpPrincipalState);
        logger.trace("end start displayHelpPrincipalState(Controller c)");
    }
}
