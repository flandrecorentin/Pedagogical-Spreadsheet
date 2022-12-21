package com.spreadsheet.pedagogicalspreadsheet.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class DiagramPrincipalState implements State{

    private static final Logger logger = LoggerFactory.getLogger(DiagramPrincipalState.class);

    @Override
    public void displayFilePrincipalState(Controller c){
        logger.trace("start displayFilePrincipalState(Controller c)");
        // Style for navbar
        c.changeActivedNavBarButton(c.getDiagramNavBarButton());
        c.changeActivedNavBarButton(c.getFileNavBarButton());
        // display diagramNavToolsBar
        c.getPaneToolBar().getChildren().add(c.getFilePannel());
        c.getPaneToolBar().getChildren().add(c.getCellPannel());
        c.getCellPannel().setVisible(false);
        c.getCellPannel().setMinHeight(0);
        c.getCellPannel().setMaxHeight(0);
        Controller.setCurrentState(c.filePrincipalState);
        logger.trace("end start displayFilePrincipalState(Controller c)");
    }

    @Override
    public void displayCellPrincipalState(Controller c){
        logger.trace("start displayCellPrincipalState(Controller c)");
        // Style for navbar
        c.changeActivedNavBarButton(c.getDiagramNavBarButton());
        c.changeActivedNavBarButton(c.getCellNavBarButton());
        // display cellNavToolsBar
        c.getPaneToolBar().getChildren().add(c.getCellPannel());
        Controller.setCurrentState(c.cellPrincipalState);
        logger.trace("end start displayCellPrincipalState(Controller c)");
    }

    @Override
    public void displayGamePrincipalState(Controller c){
        logger.trace("start displayGamePrincipalState(Controller c)");
        // Style for navbar
        c.changeActivedNavBarButton(c.getDiagramNavBarButton());
        c.changeActivedNavBarButton(c.getGameNavBarButton());
        // display gameNavToolsBar

        Controller.setCurrentState(c.gamePrincipalState);
        logger.trace("end start displayGamePrincipalState(Controller c)");
    }

    @Override
    public void displayHelpPrincipalState(Controller c){
        logger.trace("start displayHelpPrincipalState(Controller c)");
        // Style for navbar
        c.changeActivedNavBarButton(c.getDiagramNavBarButton());
        c.changeActivedNavBarButton(c.getHelpNavBarButton());
        // display gameNavToolsBar

        Controller.setCurrentState(c.helpPrincipalState);
        logger.trace("end start displayHelpPrincipalState(Controller c)");
    }

}
