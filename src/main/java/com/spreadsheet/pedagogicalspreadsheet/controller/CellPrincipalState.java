package com.spreadsheet.pedagogicalspreadsheet.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class CellPrincipalState implements State{
    private static final Logger logger = LoggerFactory.getLogger(CellPrincipalState.class);

    @Override
    public void displayFilePrincipalState(Controller c){
        logger.trace("start displayFilePrincipalState(Controller c)");
        // Style for navbar
        c.changeActivedNavBarButton(c.getCellNavBarButton());
        c.changeActivedNavBarButton(c.getFileNavBarButton());
        // display diagramNavToolsBar
        c.getCellPannel().setVisible(false);
        c.getCellPannel().setMinHeight(0);
        c.getCellPannel().setMaxHeight(0);
        c.getPaneToolBar().getChildren().add(c.getFilePannel());
        Controller.setCurrentState(c.filePrincipalState);
        Controller.setCurrentState(c.filePrincipalState);
        logger.trace("end start displayFilePrincipalState(Controller c)");
    }


    @Override
    public void displayDiagramPrincipalState(Controller c){
        logger.trace("start displayDiagramPrincipalState(Controller c)");
        // Style for navbar
        c.changeActivedNavBarButton(c.getCellNavBarButton());
        c.changeActivedNavBarButton(c.getDiagramNavBarButton());
        // display diagramNavToolsBar
        c.getPaneToolBar().getChildren().remove(c.getCellPannel());
        Controller.setCurrentState(c.diagramPrincipalState);
        logger.trace("end start displayDiagramPrincipalState(Controller c)");
    }

    @Override
    public void displayGamePrincipalState(Controller c){
        logger.trace("start displayGamePrincipalState(Controller c)");
        // Style for navbar
        c.changeActivedNavBarButton(c.getCellNavBarButton());
        c.changeActivedNavBarButton(c.getGameNavBarButton());
        // display gameNavToolsBar
        c.getPaneToolBar().getChildren().remove(c.getCellPannel());
        Controller.setCurrentState(c.gamePrincipalState);
        logger.trace("end start displayGamePrincipalState(Controller c)");
    }

    @Override
    public void displayHelpPrincipalState(Controller c){
        logger.trace("start displayHelpPrincipalState(Controller c)");
        // Style for navbar
        c.changeActivedNavBarButton(c.getCellNavBarButton());
        c.changeActivedNavBarButton(c.getHelpNavBarButton());
        // display gameNavToolsBar
        c.getPaneToolBar().getChildren().remove(c.getCellPannel());

        Controller.setCurrentState(c.helpPrincipalState);
        logger.trace("end start displayHelpPrincipalState(Controller c)");
    }
}
